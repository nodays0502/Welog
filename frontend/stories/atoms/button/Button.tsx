import React from "react";
import "./button.css";
import { MdFindInPage, MdModeEditOutline } from "react-icons/md";

interface ButtonProps {
  /**
   * React className 설정
   */
  className?: string[];

  /**
   * 버튼 내부 내용 설정
   */
  label?: string;
  /**
   * 클릭 핸들러
   */
  onClick?: () => void;

  /**
   * style 설정
   */
  style?: object;
}

/**
 * Primary UI component for user interaction
 */
export const Button = ({ label, className, style, onClick }: ButtonProps) => (
  <button
    type="button"
    style={style}
    className={`button_default ${className.join(" ")}`}
    onClick={onClick}
  >
    {label}
  </button>
);

/**
 * 각 아이콘 버튼은 미리 컴포넌트로 각각 만들어서 사용할 예정
 *
 */
export const IconButton = () => <MdModeEditOutline />;

export const FindIconButton = () => <MdFindInPage />;

/**
 * react/require-default-props
 */
Button.defaultProps = {
  className: [],
  style: {},
  onClick: () => {},
  label: "this is button",
};

export default Button;
