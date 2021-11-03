import React from "react";
import { Button } from "../../atoms/button/Button";
import "./ButtonGroup.css";

interface ButtonGroupProps {
  /**
   * className 설정
   */
  className?: string[];

  /**
   * style 정의
   */
  style?: object;

  /**
   * Buttons 정리
   */
  buttons?: string[];
}

export const ButtonGroup = ({
  style,
  className,
  buttons,
}: ButtonGroupProps) => (
  <div style={style} className={`${className.join(" ")}`}>
    {buttons.map((button) => (
      <Button label={button} />
    ))}
  </div>
);

/**
 * react/require-default-props
 */
ButtonGroup.defaultProps = {
  style: {},
  className: [],
  buttons: [],
};

export default ButtonGroup;
