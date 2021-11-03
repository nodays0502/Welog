import React from "react";
import { ImageContent } from "../../atoms/image/ImageContent";
import { TextBox } from "../../molecules/TextBox/TextBox";
import "./LeftNav.css";

interface LeftNavProps {
  /**
   * React className 설정
   */
  className?: string[];

  /**
   * 클릭 핸들러
   */
  onClick?: () => void;

  /**
   * style 설정
   */
  style?: object;

  /**
   * image
   */
  image: string;
}

/**
 * Primary UI component for user interaction
 */
export const LeftNav = ({ className, style, image, onClick }: LeftNavProps) => (
  <div
    style={style}
    className={`${className.join(" ")}`}
    onClick={onClick}
    aria-hidden="true"
  >
    <ImageContent
      src={image}
      alt="왼쪽 상단 이미지"
      className={["imageContent_default"]}
    />
    <TextBox text="대문" />
    <TextBox text="최근 바뀜" />
    <TextBox text="요즘 화제" />
    <TextBox text="기부" />
  </div>
);

/**
 * react/require-default-props
 */
LeftNav.defaultProps = {
  className: [],
  style: {},
  onClick: () => {},
};

export default LeftNav;
