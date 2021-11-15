import React from "react";

import { ComponentMeta } from "@storybook/react";

import styled from "styled-components";
import ImageBox from "./ImageBox";

export default {
  component: ImageBox,
  title: "molecules/ImageBox",
} as ComponentMeta<typeof ImageBox>;

const ComponentBox = styled.div`
  display: flex;
  justify-content: space-around;
`;

// const ButtongroupExample1 = [
//   "Home",
//   "Cloud",
//   "Platform",
//   "Connectors",
//   "Tools",
//   "Clients",
// ];

export const Default: React.VFC<{}> = () => (
  <>
    <>
      <h5>ImageBox</h5>
      <ComponentBox>
        <ImageBox  />
        <ImageBox />
      </ComponentBox>
    </>
  </>
);
