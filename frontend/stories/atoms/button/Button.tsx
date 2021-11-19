import React from "react";
// import "./button.css";
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
   * button click해야 할 함수 타입 설정
   */
  dataType?: string;

  /**
   * style 설정
   */
  style?: object;
}

/**
 * Primary UI component for user interaction
 */
const Button = ({
  label,
  className,
  style,
  dataType,
  onClick,
}: ButtonProps) => (
  <button
    type="button"
    style={style}
    className={`button_default ${className.join(" ")}`}
    onClick={onClick}
    data-type={dataType}
  >
    {label}
  </button>
);

/**
 * 각 아이콘 버튼은 미리 컴포넌트로 각각 만들어서 사용할 예정
 *
 */
export const IconButton = () => <MdModeEditOutline />;

interface FindIconButtonProps {
  /**
   * className
   */
  className: string;
}

export const FindIconButton = ({ className }: FindIconButtonProps) => (
  <div className={className}>
    <MdFindInPage size="30" />
  </div>
);

/**
 * react/require-default-props
 */
Button.defaultProps = {
  className: [],
  style: {},
  onClick: () => {},
  label: "this is button",
  dataType: "normal",
};

export default Button;
