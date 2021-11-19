/* eslint-disable jsx-a11y/label-has-associated-control */
import styled, { css } from "styled-components";
import React, { useEffect, useRef, useState } from "react";
import { useRouter } from "next/router";
import axios from "axios";
import Button from "../../../atoms/button/Button";
import Label from "../../../atoms/label/Label";
import { goRegister } from "../../../molecules/ButtonGroup/ButtonGroup";

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
const LabelDiv = styled.div<Container>`
  display: flex;
  justify-content: center;
  align-items: center;
`;

const FormDiv = styled.div`
  display: flex;
`;

// const StyledButton = styled(Button)`
//     background: blue;
// `;

const instance = axios.create({
  baseURL: `/`,
  timeout: 5000,
});

// const styledInput = styled.input``;

const LoginPage = () => {
  const [isLogIn, setIsLogIn] = useState(false);

  const [inputs, setInputs] = useState({
    id: "",
    pw: "",
    email: "",
  });

  const { id, pw, email } = inputs;

  const onChange = (e) => {
    const { name, value } = e.target;
    // console.log(name, value);
    setInputs({
      ...inputs,
      [name]: value,
    });
  };

  const login = async () => {
    // if (isLogIn) {
    // console.log(pw, email)
    const data = await instance.post("/api/auth", {
      password: "test",
      userEmail: "test@welog.com",
    });
    // const data = await instance.get('/api/user'

    // )
    console.log(data);
    // console.log("error");
    // }
    // else {

    // }
  };

  // const check = async () => {
  //   const data = await instance.get("/api/user");
  //   console.log(data);
  // };

  const inputRef = useRef(null);
  useEffect(() => {
    inputRef.current.checked = true;
    setIsLogIn(true);
  }, []);

  const router = useRouter();
  return (
    <LayoutDiv>
      <StyledDiv directColumn>
        <StyledDiv directColumn>
          <LabelDiv>
            <Label text="로그인 해주세요!" />
          </LabelDiv>
          <FormDiv>
            <div>
              <input
                type="radio"
                id="ADMIN"
                name="USER_CHOICE"
                value="ADMIN"
                onClick={() => setIsLogIn(true)}
                ref={inputRef}
              />
              <label htmlFor="ADMIN">관리자</label>
            </div>
            <div>
              <input
                type="radio"
                id="USER"
                name="USER_CHOICE"
                value="USER"
                onClick={() => setIsLogIn(false)}
              />
              <label htmlFor="USER">사용자</label>
            </div>
          </FormDiv>
          <input
            placeholder="아이디를 입력해주세요"
            onChange={onChange}
            name="id"
            value={id}
          />
          <input
            placeholder="비밀번호를 입력해주세요"
            onChange={onChange}
            name="pw"
            value={pw}
          />
          {isLogIn ? (
            <input
              placeholder="이메일을 입력해주세요"
              onChange={onChange}
              name="email"
              value={email}
            />
          ) : (
            <></>
          )}
        </StyledDiv>
        <StyledDiv>
          <Button label="회원 가입" onClick={() => goRegister(router)} />
          <Button label="로그인" onClick={() => login()} />
          {/* <Button label="확인" onClick={() => check()} /> */}
        </StyledDiv>
      </StyledDiv>
    </LayoutDiv>
  );
};

export default LoginPage;
