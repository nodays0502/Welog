import React from "react";

import { ComponentMeta } from "@storybook/react";

import styled from "styled-components";

import { Header } from "./Header";

export default {
  component: Header,
  title: "Organisms/Header",
} as ComponentMeta<typeof Header>;

const ComponentBox = styled.div`
  display: flex;
  justify-content: space-around;
`;

const ButtongroupExample1 = [
  "Home",
  "Cloud",
  "Platform",
  "Connectors",
  "Tools",
  "Clients",
  "Login",
];

export const Default: React.VFC<{}> = () => (
  <>
    <>
      <h5>Default Header</h5>
      <ComponentBox>
        <Header buttons={ButtongroupExample1} className={["header_default"]} />
      </ComponentBox>
    </>
  </>
);
