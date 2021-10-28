import React, { useState } from 'react';

import { ComponentStory, ComponentMeta } from '@storybook/react';


import { Label } from './Label';

import styled from 'styled-components';

export default{
    component: Label,
    title: 'Atoms/Label',
} as ComponentMeta<typeof Label>;

const ComponentBox = styled.div`
    display: flex;
    justify-content: space-around;
`;

export const Default: React.VFC<{}> = () => {
  
    return (<>
        <>
            <h5>Solid label</h5>
            <ComponentBox>

                <Label
                    text="Solid Label" />
                <Label 
                    text="Solid Label" />
                
            </ComponentBox>
        </>
    </>);
}