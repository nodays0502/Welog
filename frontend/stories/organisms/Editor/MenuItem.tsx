/* eslint-disable react/prop-types */
/* eslint-disable react/button-has-type */
import React from "react";
// import "./MenuItem.scss";
import remixiconUrl from "remixicon/fonts/remixicon.symbol.svg";

interface MenuItemProps {
  icon?: any;
  title?: any;
  action?: any;
  isActive?: any;
  type?: string;
}

export const MenuItem = ({
  icon,
  title,
  action,
  isActive = null,
}: MenuItemProps) => (
  <button
    className={`menu-item${isActive && isActive() ? " is-active" : ""}`}
    onClick={action}
    title={title}
  >
    <div className="remix">
      {/* <use xlinkHref={`.ri-${icon}`} /> */}
      <i className={`ri-${icon} ri-1x`} />
    </div>
  </button>
);

export default MenuItem;
