import React from "react";

import { ComponentMeta } from "@storybook/react";

import styled from "styled-components";
import { Input } from "./Input";

export default {
  component: Input,
  title: "Atoms/Input",
} as ComponentMeta<typeof Input>;

const ComponentBox = styled.div`
  display: flex;
  justify-content: space-around;
`;

export const Default: React.VFC<{}> = () => (
  <>
    <>
      <h5>Solid label</h5>
      <ComponentBox>
        <Input placeHolder="Solid Label" />
        <Input placeHolder="Solid Label" />
      </ComponentBox>
    </>
    <>
      <h5> label</h5>
      <ComponentBox>
        <Input placeHolder="Solid Label" />
        <Input placeHolder="Solid Label" />
      </ComponentBox>
    </>
  </>
);
