import React from "react";
// import "./label.css";

interface LabelProps {
  /**
   * label 텍스트
   */
  text: string;

  /**
   * style 정의
   */
  style?: object;

  /**
   * className 설정
   */
  className?: string[];
}

const Label = ({ text, style, className }: LabelProps) => (
  <div style={style} className={`Label_default ${className.join(" ")}`}>
    {text}
  </div>
);

Label.defaultProps = {
  style: {},
  className: [],
};

export default Label;
