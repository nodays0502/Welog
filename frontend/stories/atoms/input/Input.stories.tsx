import React, { useState } from 'react';

import { ComponentStory, ComponentMeta } from '@storybook/react';


import { Input } from './Input';

import styled from 'styled-components';

export default{
    component: Input,
    title: 'Atoms/Input',
} as ComponentMeta<typeof Input>;

const ComponentBox = styled.div`
    display: flex;
    justify-content: space-around;
`;

export const Default: React.VFC<{}> = () => {
  
    return (<>
        <>
            <h5>Solid label</h5>
            <ComponentBox>

                <Input
                    label="Solid Label" />
                <Input 
                    label="Solid Label" />
                
            </ComponentBox>
        </>
        <>
            <h5> label</h5>
            <ComponentBox>

                <Input
                    text="Solid Label" />
                <Input 
                    text="Solid Label" />
                
            </ComponentBox>
        </>
    </>);
}