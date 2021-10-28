import React, { useState } from 'react';

import { ComponentStory, ComponentMeta } from '@storybook/react';

import { Button } from './Button';

import styled from 'styled-components';

export default {
    component: Button,
    title: 'Atoms/Button',
} as ComponentMeta<typeof Button>;

const ComponentBox = styled.div`
    display: flex;
    justify-content: space-around;
`;

export const Default: React.VFC<{}> = () => {
  
    const [borderRadius, setBorderRadius] = useState('0%');


    return (<>
        <>
            <h5>Solid button</h5>
            <ComponentBox>
                <Button borderRadius={borderRadius}
                    label="Solid Button" />
                <Button borderRadius={borderRadius}
                    className={["button_hover"]}
                    label="Solid Button" />
            </ComponentBox>
        </>
        <>
            <h5>Ghost button</h5>
            <ComponentBox>
              <Button borderRadius={borderRadius}
                    className={["button_Ghost"]}
                    label="Ghost Button" />
              <Button borderRadius={borderRadius}
                    className={["button_hover"]}
                    label="Ghost Button" />
          </ComponentBox>
        </>
        <>
            <h5>Outline button</h5>
            <ComponentBox>
              <Button borderRadius={borderRadius}
                    className={["button_Outline"]}
                    label="Outline Button" />
              <Button borderRadius={borderRadius}
                    className={["button_hover"]}
                    label="Outline Button" />
            </ComponentBox>
        </>
        <>
            <h5>Light Solid button</h5>
            <Button borderRadius={borderRadius} label="Button" />
        </>
        <>
            <h5>Text button</h5>
            <ComponentBox>
              <Button borderRadius={borderRadius}
                    className={["button_Text"]}
                    label="Text Button" />
              <Button borderRadius={borderRadius}
                    className={["button_hover"]}
                    label="Text Button" />
            </ComponentBox>
        </>
        <>
            <h5>Icon button</h5>
            <Button borderRadius={borderRadius} label="Button" />
        </>
        <>
            <h5>Destructive button</h5>
            <ComponentBox>
              <Button borderRadius={borderRadius}
                    className={["button_Destructive"]}
                    label="Destructive Button" />
              <Button borderRadius={borderRadius}
                    className={["button_hover"]}
                    label="Destructive Button" />
            </ComponentBox>
        </>
        
    </>);
};
    
export const Danger: React.VFC<{}> = () => <Button label="Button" />;
Default.storyName = '';

export const Ghost: React.VFC<{}> = () => <Button label="Button" />;
export const Outline: React.VFC<{}> = () => <Button label="Button" />;
export const Icon: React.VFC<{}> = () => <Button label="Button" />;
export const Destructive: React.VFC<{}> = () => <Button label="Button" />;

