import React from "react";

import { ComponentMeta } from "@storybook/react";

import styled from "styled-components";

import Editor from "./index";

export default {
  component: Editor,
  title: "Organisms/Editor",
} as ComponentMeta<typeof Editor>;

const ComponentBox = styled.div`
  display: flex;
  justify-content: space-around;
`;

export const Default: React.VFC<{}> = () => (
  <>
    <>
      <h5>Editor</h5>
      <ComponentBox>
        <Editor />
      </ComponentBox>
    </>
  </>
);
