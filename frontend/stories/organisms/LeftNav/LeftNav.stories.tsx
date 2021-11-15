import React from "react";

import { ComponentMeta } from "@storybook/react";

import styled from "styled-components";

import LeftNav from "./LeftNav";

export default {
  component: LeftNav,
  title: "Organisms/LeftNav",
} as ComponentMeta<typeof LeftNav>;

const ComponentBox = styled.div`
  display: flex;
  justify-content: space-around;
`;

const image = "/public/static/logos/logo.png";

export const Default: React.VFC<{}> = () => (
  <>
    <>
      <h5>LeftNav</h5>
      <ComponentBox>
        <LeftNav image={image} />
      </ComponentBox>
    </>
  </>
);
