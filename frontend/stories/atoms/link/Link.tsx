import React from 'react';
import './link.css';

interface LinkProps {
    /**
     * Link 텍스트 설정
     */
    text: string;

    /**
     * Link style 정의
     */
    style?: object;

    /**
     * Link 클릭 시 이동할 링크 정의
     */
    href: string;

    /**
     * a tag className 정의
     */
    className?: string[];
}

export const Link = ({
  text,
  style,
  href,
  className,
}: LinkProps) => (
  <a
    style={style}
    href={href}
    className={`${className.join(' ')}`}
  >
    {text}
  </a>
);

Link.defaultProps = {
  style: [],
  className: [],
};

export default Link;
