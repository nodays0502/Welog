import React from "react";

import { ComponentMeta } from "@storybook/react";

import styled from "styled-components";
import TextBox from "./TextBox";

export default {
  component: TextBox,
  title: "molecules/TextBox",
} as ComponentMeta<typeof TextBox>;

const ComponentBox = styled.div`
  display: flex;
  justify-content: space-around;
`;

export const Default: React.VFC<{}> = () => (
  <>
    <>
      <h5>TextBox</h5>
      <ComponentBox>
        <TextBox text="Atlassian Test" />
      </ComponentBox>
    </>
  </>
);
