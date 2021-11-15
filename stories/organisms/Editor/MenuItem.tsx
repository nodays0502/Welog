/* eslint-disable react/prop-types */
/* eslint-disable react/button-has-type */
import React from "react";
import "./MenuItem.scss";
import remixiconUrl from "remixicon/fonts/remixicon.symbol.svg";

interface MenuItemProps {
  icon?: any;
  title?: any;
  action?: any;
  isActive?: any;
  type?: string;
}

export default ({ icon, title, action, isActive = null }: MenuItemProps) => (
  <button
    className={`menu-item${isActive && isActive() ? " is-active" : ""}`}
    onClick={action}
    title={title}
  >
    <svg className="remix">
      <use xlinkHref={`${remixiconUrl}#ri-${icon}`} />
    </svg>
  </button>
);
