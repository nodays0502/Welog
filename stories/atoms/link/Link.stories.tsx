import React, { useState } from 'react';

import { ComponentStory, ComponentMeta } from '@storybook/react';

import { Link } from './Link';

import styled from 'styled-components';

export default{
    component: Link,
    title: 'Atoms/Link',
} as ComponentMeta<typeof Link>;


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
                    label="Solid Label" />
                <Label 
                    label="Solid Label" />
                
            </ComponentBox>
        </>
    </>);
}