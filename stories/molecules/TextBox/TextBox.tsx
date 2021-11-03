import React from "react";
import { Label } from "../../atoms/label/Label";
import "./TextBox.css";

interface TextBoxProps {
  /**
   * className 설정
   */
  className?: string[];

  /**
   * style 정의
   */
  style?: object;

  /**
   * textbox 안에 들어갈 내용
   *
   */
  text: string;
}

export const TextBox = ({ style, className, text }: TextBoxProps) => (
  <div style={style} className={`TextBox_default ${className.join(" ")}`}>
    <Label text={text} />
  </div>
);

/**
 * react/require-default-props
 */
TextBox.defaultProps = {
  style: {},
  className: [],
};

export default TextBox;
