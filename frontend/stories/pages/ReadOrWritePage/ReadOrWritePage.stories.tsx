import React from "react";

import { ComponentMeta } from "@storybook/react";

import styled from "styled-components";

import ReadOrWritePage from "./ReadOrWritePage";

export default {
  component: ReadOrWritePage,
  title: "Pages/ReadOrWritePage",
} as ComponentMeta<typeof ReadOrWritePage>;

const ComponentBox = styled.div`
  display: flex;
  justify-content: space-around;
`;

export const Default: React.VFC<{}> = () => (
  <>
    <>
      <ComponentBox>
        <ReadOrWritePage />
      </ComponentBox>
    </>
  </>
);
