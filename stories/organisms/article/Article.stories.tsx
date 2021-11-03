import React from "react";

import { ComponentMeta } from "@storybook/react";

import styled from "styled-components";

import { Article } from "./Article";

export default {
  component: Article,
  title: "Organisms/Article",
} as ComponentMeta<typeof Article>;

const ComponentBox = styled.div`
  display: flex;
  justify-content: space-around;
`;

export const Default: React.VFC<{}> = () => (
  <>
    <>
      <h5>Article</h5>
      <ComponentBox>
        <Article />
      </ComponentBox>
    </>
  </>
);

// export const Danger: React.VFC<{}> = () => <Button label="Button" />;
// Default.storyName = "";

// export const Ghost: React.VFC<{}> = () => <Button label="Button" />;
// export const Outline: React.VFC<{}> = () => <Button label="Button" />;
// export const Destructive: React.VFC<{}> = () => <Button label="Button" />;
