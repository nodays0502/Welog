import React from "react";

import { ComponentMeta } from "@storybook/react";

import styled from "styled-components";
import { Link } from "./Link";

export default {
  component: Link,
  title: "Atoms/Link",
} as ComponentMeta<typeof Link>;

const ComponentBox = styled.div`
  display: flex;
  justify-content: space-around;
`;

const defaultLink = `http://localhost:6006/?path=/story/atoms-link--default`;

export const Default: React.VFC<{}> = () => (
  <>
    <>
      <h5>Solid label</h5>
      <ComponentBox>
        <Link text="data" href={defaultLink} />
        <Link text="data" href={defaultLink} />
      </ComponentBox>
    </>
  </>
);
