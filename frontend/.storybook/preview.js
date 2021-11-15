import React from "react";

import * as NextImage from "next/image";

const OriginalNextImage = NextImage.default;
Object.defineProperty(NextImage, "default", {
  configurable: true,
  value: (props) => <OriginalNextImage {...props} unoptimized />,
});

import { GlobalStyle } from "../src/shared/global";

const customViewports = {
  kindleFire2: {
    name: "1920*1080 view",
    styles: {
      width: "1920px",
      height: "1080px",
    },
  },
};

// 모든 스토리에 스타일을 적용하기 위한 글로벌 decorator
export const decorators = [
  (Story) => (
    <>
      <GlobalStyle />
      <Story />
    </>
  ),
];

export const parameters = {
  actions: { argTypesRegex: "^on[A-Z].*" },
  controls: {
    matchers: {
      color: /(background|color)$/i,
      date: /Date$/,
    },
  },
  viewport: { viewports: customViewports },
};
