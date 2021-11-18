/* eslint-disable jsx-a11y/label-has-associated-control */
import styled, { css } from "styled-components";
import React, { useState } from "react";
import { useRouter } from "next/router";
import Button from "../../../atoms/button/Button";
import Input from "../../../atoms/input/Input";
import Label from "../../../atoms/label/Label";
import { goLogin } from "../../../molecules/ButtonGroup/ButtonGroup";

interface Container {
  directColumn?: boolean;
}

const StyledDiv = styled.div<Container>`
  display: flex;
  flex-direction: row;
  ${(props) =>
    props.directColumn &&
    css`
      flex-direction: column;
    `}

  > * {
    margin: 1vw;
  }
`;

const LayoutDiv = styled.div<Container>`
  display: flex;
  flex-direction: row;
  width: 100vw;
  height: 100vh;
  justify-content: center;
  align-items: center;
`;

const FormDiv = styled.div`
  display: flex;
`;

// const styledInput = styled.input``;

const RegisterPage = () => {
  const [isRegister, setIsRegister] = useState(false);
  const router = useRouter();
  return (
    <LayoutDiv>
      <StyledDiv directColumn>
        <StyledDiv directColumn>
          <Label text="회원가입 페이지입니다!" />
          <FormDiv>
            <div>
              <input
                type="radio"
                id="ADMIN"
                name="USER_CHOICE"
                value="ADMIN"
                onClick={() => setIsRegister(true)}
              />
              <label htmlFor="ADMIN">관리자</label>
            </div>
            <div>
              <input
                type="radio"
                id="USER"
                name="USER_CHOICE"
                value="USER"
                onClick={() => setIsRegister(false)}
              />
              <label htmlFor="USER">사용자</label>
            </div>
          </FormDiv>
          <Input placeHolder="아이디를 입력해주세요" />
          <Input placeHolder="비밀번호를 입력해주세요" />
          {isRegister ? <Input placeHolder="이메일을 입력해주세요" /> : <></>}
        </StyledDiv>
        <StyledDiv>
          <Button label="회원 가입" />
          <Button label="로그인" onClick={() => goLogin(router)} />
        </StyledDiv>
      </StyledDiv>
    </LayoutDiv>
  );
};

export default RegisterPage;
