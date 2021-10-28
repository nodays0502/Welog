import { createGlobalStyle, css } from "styled-components";
import { normalize } from "styled-normalize";
// import { color, typography } from './styles';

export const fontUrl =
  "https://fonts.googleapis.com/css?family=Nunito+Sans:400,700,800,900";

export const bodyStyles = css`
  font-family: "NunitoSans" "Cafe24SsurroundAir" !important;
`;

export const GlobalStyle = createGlobalStyle`
 ${normalize}
  @font-face{
    font-family: 'Cafe24SsurroundAir';
    font-style: normal;
    font-weight: 400;
    src: url('../../static/fonts/Cafe24SsurroundAir.ttf');
  }

  @font-face{
    font-family: 'NunitoSans';
    font-style: normal;
    font-weight: 400;
    src: url('../../static/fonts/NunitoSans-Light.ttf');
  }

  body {
    ${bodyStyles}
  }
`;
