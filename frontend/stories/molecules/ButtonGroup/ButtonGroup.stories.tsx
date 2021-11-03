import React from "react";

import { ComponentMeta } from "@storybook/react";

import styled from "styled-components";
import ButtonGroup from "./ButtonGroup";

export default {
  component: ButtonGroup,
  title: "molecules/ButtonGroup",
} as ComponentMeta<typeof ButtonGroup>;

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
];

export const Default: React.VFC<{}> = () => (
  <>
    <>
      <h5>ButtonGroup</h5>
      <ComponentBox>
        <ButtonGroup buttons={ButtongroupExample1} />
      </ComponentBox>
    </>
  </>
);

