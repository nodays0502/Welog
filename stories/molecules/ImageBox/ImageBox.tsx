import React from "react";
// import { ImageContent } from '../../atoms/image/ImageContent';
import "./ImageBox.css";

interface ImageBoxProps {
  /**
   * className 설정
   */
  className?: string[];

  /**
   * style 정의
   */
  style?: object;

  /**
   * ImageBoxs 정리
   */
  // ImageBoxs?: ImageContent[];
}

export const ImageBox = ({ style, className }: ImageBoxProps) => (
  <div style={style} className={`${className.join(" ")}`} />
);

/**
 * react/require-default-props
 */
ImageBox.defaultProps = {
  style: {},
  className: [],
};

export default ImageBox;
