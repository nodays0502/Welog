import React from "react";
// import "./input.css";

interface InputProps {
  /**
   * Input placeHolder 텍스트
   */
  placeHolder: string;

  /**
   * className 설정
   */
  className?: string[];

  /**
   * style 정의
   */
  style?: object;
}

const Input = ({ style, placeHolder, className }: InputProps) => (
  <input
    style={style}
    placeholder={placeHolder}
    className={`input_default ${className.join(" ")}`}
  />
);

/**
 * react/require-default-props
 */
Input.defaultProps = {
  style: {},
  className: [],
};

export default Input;
