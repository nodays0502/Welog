import React from "react";

import { ComponentMeta } from "@storybook/react";

import styled from "styled-components";

import { Button, IconButton } from "./Button";

export default {
  component: Button,
  title: "Atoms/Button",
} as ComponentMeta<typeof Button>;

const ComponentBox = styled.div`
  display: flex;
  justify-content: space-around;
`;

export const Default: React.VFC<{}> = () => (
  <>
    <>
      <h5>Solid button</h5>
      <ComponentBox>
        <Button label="Solid Button" />
        <Button className={["button_hover"]} label="Solid Button" />
      </ComponentBox>
    </>
    <>
      <h5>Ghost button</h5>
      <ComponentBox>
        <Button className={["button_Ghost"]} label="Ghost Button" />
        <Button className={["button_hover"]} label="Ghost Button" />
      </ComponentBox>
    </>
    <>
      <h5>Outline button</h5>
      <ComponentBox>
        <Button className={["button_Outline"]} label="Outline Button" />
        <Button className={["button_hover"]} label="Outline Button" />
      </ComponentBox>
    </>
    <>
      <h5>Light Solid button</h5>
      <ComponentBox>
        <Button className={["button_Text"]} label="Light Solid Button" />
        <Button className={["button_hover"]} label="Light Solid Button" />
      </ComponentBox>
    </>
    <>
      <h5>Text button</h5>
      <ComponentBox>
        <Button className={["button_Text"]} label="Text Button" />
        <Button className={["button_hover"]} label="Text Button" />
      </ComponentBox>
    </>
    <>
      <h5>Icon button</h5>
      <ComponentBox>
        <IconButton />
      </ComponentBox>
    </>
    <>
      <h5>Destructive button</h5>
      <ComponentBox>
        <Button className={["button_Destructive"]} label="Destructive Button" />
        <Button className={["button_hover"]} label="Destructive Button" />
      </ComponentBox>
    </>
  </>
);

// export const Danger: React.VFC<{}> = () => <Button label="Button" />;
// Default.storyName = "";

// export const Ghost: React.VFC<{}> = () => <Button label="Button" />;
// export const Outline: React.VFC<{}> = () => <Button label="Button" />;
export const Icon: React.VFC<{}> = () => <Button label="Button" />;
// export const Destructive: React.VFC<{}> = () => <Button label="Button" />;
