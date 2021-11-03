import React from "react";

import { ComponentMeta } from "@storybook/react";

import styled from "styled-components";

import { MainPage } from "./MainPage";

export default {
  component: MainPage,
  title: "Pages/MainPage",
} as ComponentMeta<typeof MainPage>;

const ComponentBox = styled.div`
  display: flex;
  justify-content: space-around;
`;

export const Default: React.VFC<{}> = () => (
  <>
    <>
      <h5>MainPage</h5>
      <ComponentBox>
        <MainPage />
      </ComponentBox>
    </>
  </>
);
