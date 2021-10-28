import { css } from "styled-components";
import { rgba } from "polished";

export const typography = {
  type: {
    primary: '"Nunito Sans", "Helvetica Neue", Helvetica, Arial, sans-serif',
    code: '"SFMono-Regular", Consolas, "Liberation Mono", Menlo, Courier, monospace',
  },
};

export const color = css`
  border: 1px solid ${rgba(0, 0, 0, 0.1)};
`;
