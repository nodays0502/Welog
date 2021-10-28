import React from 'react';
import './button.css';

interface ButtonProps {

  /**
   * 버튼 배경 색깔
   */
  backgroundColor?: string;

  /**
   * 버튼 테두리 라운드 설정
   */
  borderRadius?: string;

  /**
   * React className 설정
   */
  className?: string[];

  /**
   * 버튼 내부 내용 설정
   */
  label: string;
  /**
   * 클릭 핸들러
   */
  onClick?: () => void;
}

/**
 * Primary UI component for user interaction
 */
export const Button = ({
  backgroundColor,
  label,
  borderRadius,
  className,
  onClick,
}: ButtonProps) => (
  <button
    type="button"
    style={{
      backgroundColor,
      borderRadius,
    }}
    className={`button_default ${className.join(' ')}`}
    onClick={onClick}
  >
    {label}
  </button>
);
/**
 * react/require-default-props
 */
Button.defaultProps = {
  backgroundColor: 'white',
  borderRadius: '0%',
  className: [],
  onClick: () => { },
};

export default Button;
