import React from "react";

import { ComponentMeta } from "@storybook/react";

import styled from "styled-components";
import { Label } from "./Label";

export default {
  component: Label,
  title: "Atoms/Label",
} as ComponentMeta<typeof Label>;

const ComponentBox = styled.div`
  display: flex;
  justify-content: space-around;
`;

export const Default: React.VFC<{}> = () => (
  <>
    <>
      <h5>Solid label</h5>
      <ComponentBox>
        <Label text="Solid Label" />
        <Label text="Solid Label" />
      </ComponentBox>
    </>
  </>
);
