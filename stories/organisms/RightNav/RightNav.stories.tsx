import React from "react";

import { ComponentMeta } from "@storybook/react";

import styled from "styled-components";

import RightNav from "./RightNav";

export default {
  component: RightNav,
  title: "Organisms/RightNav",
} as ComponentMeta<typeof RightNav>;

const ComponentBox = styled.div`
  display: flex;
  justify-content: space-around;
`;

export const Default: React.VFC<{}> = () => (
  <>
    <>
      <h5>RightNav</h5>
      <ComponentBox>
        <RightNav />
      </ComponentBox>
    </>
  </>
);
