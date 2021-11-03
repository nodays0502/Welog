import React from "react";

import { ComponentMeta } from "@storybook/react";

import styled from "styled-components";

import { ImageContent } from "./ImageContent";

export default {
  component: ImageContent,
  title: "Atoms/ImageContent",
} as ComponentMeta<typeof ImageContent>;

const ComponentBox = styled.div`
  display: flex;
  justify-content: space-around;
`;

export const Default: React.VFC<{}> = () => (
  <>
    <>
      <h5>Image</h5>
      <ComponentBox>
        <ImageContent
          src="/public/static/images/default.png"
          alt="기본 이미지"
          className={["imageContent_default"]}
        />
      </ComponentBox>
    </>
  </>
);
