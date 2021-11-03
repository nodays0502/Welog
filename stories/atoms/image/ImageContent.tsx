import React from "react";
import "./imageContent.css";
// @ts-ignore
import Image from "next/image";

interface ImageContentProps {
  /**
   * React className 설정
   */
  className?: string[];
  /**
   * 클릭 핸들러
   */
  onClick?: () => void;

  /**
   * src 설정
   */
  src: string;

  /**
   * alt 설정
   */
  alt: string;

  /**
   * style 설정
   */
  style?: object;
}

/**
 * Primary UI component for user interaction
 */
export const ImageContent = ({
  className,
  style,
  onClick,
  src,
  alt,
}: ImageContentProps) => (
  <div
    style={style}
    className={`${className.join(" ")}`}
    onClick={onClick}
    aria-hidden="true"
  >
    <Image className="image" width="100%" height="100%" src={src} alt={alt} />
  </div>
);

/**
 * react/require-default-props
 */
ImageContent.defaultProps = {
  className: [],
  style: {},
  onClick: () => {},
};

export default ImageContent;
