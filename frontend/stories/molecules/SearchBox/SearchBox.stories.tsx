import React from "react";

import { ComponentMeta } from "@storybook/react";

import styled from "styled-components";
import SearchBox from "./SearchBox";

export default {
  component: SearchBox,
  title: "molecules/SearchBox",
} as ComponentMeta<typeof SearchBox>;

const ComponentBox = styled.div`
  display: flex;
  justify-content: space-around;
`;

export const Default: React.VFC<{}> = () => (
  <>
    <>
      <h5>SearchBox</h5>
      <ComponentBox>
        <SearchBox />
      </ComponentBox>
    </>
  </>
);
