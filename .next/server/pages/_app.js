(() => {
var exports = {};
exports.id = "pages/_app";
exports.ids = ["pages/_app"];
exports.modules = {

/***/ "./pages/_app.tsx":
/*!************************!*\
  !*** ./pages/_app.tsx ***!
  \************************/
/***/ ((__unused_webpack_module, __webpack_exports__, __webpack_require__) => {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export */ __webpack_require__.d(__webpack_exports__, {
/* harmony export */   "default": () => (__WEBPACK_DEFAULT_EXPORT__)
/* harmony export */ });
/* harmony import */ var _stories_atoms_button_button_css__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! ../stories/atoms/button/button.css */ "./stories/atoms/button/button.css");
/* harmony import */ var _stories_atoms_button_button_css__WEBPACK_IMPORTED_MODULE_0___default = /*#__PURE__*/__webpack_require__.n(_stories_atoms_button_button_css__WEBPACK_IMPORTED_MODULE_0__);
/* harmony import */ var _stories_atoms_image_imageContent_css__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../stories/atoms/image/imageContent.css */ "./stories/atoms/image/imageContent.css");
/* harmony import */ var _stories_atoms_image_imageContent_css__WEBPACK_IMPORTED_MODULE_1___default = /*#__PURE__*/__webpack_require__.n(_stories_atoms_image_imageContent_css__WEBPACK_IMPORTED_MODULE_1__);
/* harmony import */ var _stories_atoms_input_input_css__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ../stories/atoms/input/input.css */ "./stories/atoms/input/input.css");
/* harmony import */ var _stories_atoms_input_input_css__WEBPACK_IMPORTED_MODULE_2___default = /*#__PURE__*/__webpack_require__.n(_stories_atoms_input_input_css__WEBPACK_IMPORTED_MODULE_2__);
/* harmony import */ var _stories_atoms_label_label_css__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ../stories/atoms/label/label.css */ "./stories/atoms/label/label.css");
/* harmony import */ var _stories_atoms_label_label_css__WEBPACK_IMPORTED_MODULE_3___default = /*#__PURE__*/__webpack_require__.n(_stories_atoms_label_label_css__WEBPACK_IMPORTED_MODULE_3__);
/* harmony import */ var _stories_atoms_link_link_css__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ../stories/atoms/link/link.css */ "./stories/atoms/link/link.css");
/* harmony import */ var _stories_atoms_link_link_css__WEBPACK_IMPORTED_MODULE_4___default = /*#__PURE__*/__webpack_require__.n(_stories_atoms_link_link_css__WEBPACK_IMPORTED_MODULE_4__);
/* harmony import */ var _stories_molecules_ButtonGroup_ButtonGroup_css__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ../stories/molecules/ButtonGroup/ButtonGroup.css */ "./stories/molecules/ButtonGroup/ButtonGroup.css");
/* harmony import */ var _stories_molecules_ButtonGroup_ButtonGroup_css__WEBPACK_IMPORTED_MODULE_5___default = /*#__PURE__*/__webpack_require__.n(_stories_molecules_ButtonGroup_ButtonGroup_css__WEBPACK_IMPORTED_MODULE_5__);
/* harmony import */ var _stories_molecules_ImageBox_ImageBox_css__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! ../stories/molecules/ImageBox/ImageBox.css */ "./stories/molecules/ImageBox/ImageBox.css");
/* harmony import */ var _stories_molecules_ImageBox_ImageBox_css__WEBPACK_IMPORTED_MODULE_6___default = /*#__PURE__*/__webpack_require__.n(_stories_molecules_ImageBox_ImageBox_css__WEBPACK_IMPORTED_MODULE_6__);
/* harmony import */ var _stories_molecules_SearchBox_SearchBox_css__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! ../stories/molecules/SearchBox/SearchBox.css */ "./stories/molecules/SearchBox/SearchBox.css");
/* harmony import */ var _stories_molecules_SearchBox_SearchBox_css__WEBPACK_IMPORTED_MODULE_7___default = /*#__PURE__*/__webpack_require__.n(_stories_molecules_SearchBox_SearchBox_css__WEBPACK_IMPORTED_MODULE_7__);
/* harmony import */ var _stories_molecules_TextBox_TextBox_css__WEBPACK_IMPORTED_MODULE_8__ = __webpack_require__(/*! ../stories/molecules/TextBox/TextBox.css */ "./stories/molecules/TextBox/TextBox.css");
/* harmony import */ var _stories_molecules_TextBox_TextBox_css__WEBPACK_IMPORTED_MODULE_8___default = /*#__PURE__*/__webpack_require__.n(_stories_molecules_TextBox_TextBox_css__WEBPACK_IMPORTED_MODULE_8__);
/* harmony import */ var _stories_organisms_article_Article_css__WEBPACK_IMPORTED_MODULE_9__ = __webpack_require__(/*! ../stories/organisms/article/Article.css */ "./stories/organisms/article/Article.css");
/* harmony import */ var _stories_organisms_article_Article_css__WEBPACK_IMPORTED_MODULE_9___default = /*#__PURE__*/__webpack_require__.n(_stories_organisms_article_Article_css__WEBPACK_IMPORTED_MODULE_9__);
/* harmony import */ var _stories_organisms_Editor_MenuBar_scss__WEBPACK_IMPORTED_MODULE_10__ = __webpack_require__(/*! ../stories/organisms/Editor/MenuBar.scss */ "./stories/organisms/Editor/MenuBar.scss");
/* harmony import */ var _stories_organisms_Editor_MenuBar_scss__WEBPACK_IMPORTED_MODULE_10___default = /*#__PURE__*/__webpack_require__.n(_stories_organisms_Editor_MenuBar_scss__WEBPACK_IMPORTED_MODULE_10__);
/* harmony import */ var _stories_organisms_Editor_MenuItem_scss__WEBPACK_IMPORTED_MODULE_11__ = __webpack_require__(/*! ../stories/organisms/Editor/MenuItem.scss */ "./stories/organisms/Editor/MenuItem.scss");
/* harmony import */ var _stories_organisms_Editor_MenuItem_scss__WEBPACK_IMPORTED_MODULE_11___default = /*#__PURE__*/__webpack_require__.n(_stories_organisms_Editor_MenuItem_scss__WEBPACK_IMPORTED_MODULE_11__);
/* harmony import */ var _stories_organisms_Editor_styles_scss__WEBPACK_IMPORTED_MODULE_12__ = __webpack_require__(/*! ../stories/organisms/Editor/styles.scss */ "./stories/organisms/Editor/styles.scss");
/* harmony import */ var _stories_organisms_Editor_styles_scss__WEBPACK_IMPORTED_MODULE_12___default = /*#__PURE__*/__webpack_require__.n(_stories_organisms_Editor_styles_scss__WEBPACK_IMPORTED_MODULE_12__);
/* harmony import */ var _stories_organisms_Header_Header_css__WEBPACK_IMPORTED_MODULE_13__ = __webpack_require__(/*! ../stories/organisms/Header/Header.css */ "./stories/organisms/Header/Header.css");
/* harmony import */ var _stories_organisms_Header_Header_css__WEBPACK_IMPORTED_MODULE_13___default = /*#__PURE__*/__webpack_require__.n(_stories_organisms_Header_Header_css__WEBPACK_IMPORTED_MODULE_13__);
/* harmony import */ var _stories_organisms_LeftNav_LeftNav_css__WEBPACK_IMPORTED_MODULE_14__ = __webpack_require__(/*! ../stories/organisms/LeftNav/LeftNav.css */ "./stories/organisms/LeftNav/LeftNav.css");
/* harmony import */ var _stories_organisms_LeftNav_LeftNav_css__WEBPACK_IMPORTED_MODULE_14___default = /*#__PURE__*/__webpack_require__.n(_stories_organisms_LeftNav_LeftNav_css__WEBPACK_IMPORTED_MODULE_14__);
/* harmony import */ var _stories_organisms_RightNav_RightNav_css__WEBPACK_IMPORTED_MODULE_15__ = __webpack_require__(/*! ../stories/organisms/RightNav/RightNav.css */ "./stories/organisms/RightNav/RightNav.css");
/* harmony import */ var _stories_organisms_RightNav_RightNav_css__WEBPACK_IMPORTED_MODULE_15___default = /*#__PURE__*/__webpack_require__.n(_stories_organisms_RightNav_RightNav_css__WEBPACK_IMPORTED_MODULE_15__);
/* harmony import */ var _stories_pages_MainPage_MainPage_css__WEBPACK_IMPORTED_MODULE_16__ = __webpack_require__(/*! ../stories/pages/MainPage/MainPage.css */ "./stories/pages/MainPage/MainPage.css");
/* harmony import */ var _stories_pages_MainPage_MainPage_css__WEBPACK_IMPORTED_MODULE_16___default = /*#__PURE__*/__webpack_require__.n(_stories_pages_MainPage_MainPage_css__WEBPACK_IMPORTED_MODULE_16__);
/* harmony import */ var _stories_pages_ReadOrWritePage_ReadOrWritePage_scss__WEBPACK_IMPORTED_MODULE_17__ = __webpack_require__(/*! ../stories/pages/ReadOrWritePage/ReadOrWritePage.scss */ "./stories/pages/ReadOrWritePage/ReadOrWritePage.scss");
/* harmony import */ var _stories_pages_ReadOrWritePage_ReadOrWritePage_scss__WEBPACK_IMPORTED_MODULE_17___default = /*#__PURE__*/__webpack_require__.n(_stories_pages_ReadOrWritePage_ReadOrWritePage_scss__WEBPACK_IMPORTED_MODULE_17__);
/* harmony import */ var react__WEBPACK_IMPORTED_MODULE_18__ = __webpack_require__(/*! react */ "react");
/* harmony import */ var react__WEBPACK_IMPORTED_MODULE_18___default = /*#__PURE__*/__webpack_require__.n(react__WEBPACK_IMPORTED_MODULE_18__);
/* harmony import */ var next_head__WEBPACK_IMPORTED_MODULE_19__ = __webpack_require__(/*! next/head */ "next/head");
/* harmony import */ var next_head__WEBPACK_IMPORTED_MODULE_19___default = /*#__PURE__*/__webpack_require__.n(next_head__WEBPACK_IMPORTED_MODULE_19__);
/* harmony import */ var react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_20__ = __webpack_require__(/*! react/jsx-dev-runtime */ "react/jsx-dev-runtime");
/* harmony import */ var react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_20___default = /*#__PURE__*/__webpack_require__.n(react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_20__);
var _jsxFileName = "D:\\self_project\\self_project_frontend\\pages\\_app.tsx";

function ownKeys(object, enumerableOnly) { var keys = Object.keys(object); if (Object.getOwnPropertySymbols) { var symbols = Object.getOwnPropertySymbols(object); if (enumerableOnly) { symbols = symbols.filter(function (sym) { return Object.getOwnPropertyDescriptor(object, sym).enumerable; }); } keys.push.apply(keys, symbols); } return keys; }

function _objectSpread(target) { for (var i = 1; i < arguments.length; i++) { var source = arguments[i] != null ? arguments[i] : {}; if (i % 2) { ownKeys(Object(source), true).forEach(function (key) { _defineProperty(target, key, source[key]); }); } else if (Object.getOwnPropertyDescriptors) { Object.defineProperties(target, Object.getOwnPropertyDescriptors(source)); } else { ownKeys(Object(source)).forEach(function (key) { Object.defineProperty(target, key, Object.getOwnPropertyDescriptor(source, key)); }); } } return target; }

function _defineProperty(obj, key, value) { if (key in obj) { Object.defineProperty(obj, key, { value: value, enumerable: true, configurable: true, writable: true }); } else { obj[key] = value; } return obj; }
























function MyApp({
  Component,
  pageProps
}) {
  return /*#__PURE__*/(0,react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_20__.jsxDEV)(react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_20__.Fragment, {
    children: [/*#__PURE__*/(0,react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_20__.jsxDEV)((next_head__WEBPACK_IMPORTED_MODULE_19___default()), {
      children: [/*#__PURE__*/(0,react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_20__.jsxDEV)("meta", {
        name: "viewport",
        content: "width=device-width, initial-scale=1"
      }, void 0, false, {
        fileName: _jsxFileName,
        lineNumber: 31,
        columnNumber: 9
      }, this), /*#__PURE__*/(0,react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_20__.jsxDEV)("title", {
        children: "kiwi wiki"
      }, void 0, false, {
        fileName: _jsxFileName,
        lineNumber: 32,
        columnNumber: 9
      }, this)]
    }, void 0, true, {
      fileName: _jsxFileName,
      lineNumber: 30,
      columnNumber: 7
    }, this), /*#__PURE__*/(0,react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_20__.jsxDEV)(Component, _objectSpread({}, pageProps), void 0, false, {
      fileName: _jsxFileName,
      lineNumber: 34,
      columnNumber: 7
    }, this)]
  }, void 0, true);
}

/* harmony default export */ const __WEBPACK_DEFAULT_EXPORT__ = (MyApp);

/***/ }),

/***/ "./stories/atoms/button/button.css":
/*!*****************************************!*\
  !*** ./stories/atoms/button/button.css ***!
  \*****************************************/
/***/ (() => {



/***/ }),

/***/ "./stories/atoms/image/imageContent.css":
/*!**********************************************!*\
  !*** ./stories/atoms/image/imageContent.css ***!
  \**********************************************/
/***/ (() => {



/***/ }),

/***/ "./stories/atoms/input/input.css":
/*!***************************************!*\
  !*** ./stories/atoms/input/input.css ***!
  \***************************************/
/***/ (() => {



/***/ }),

/***/ "./stories/atoms/label/label.css":
/*!***************************************!*\
  !*** ./stories/atoms/label/label.css ***!
  \***************************************/
/***/ (() => {



/***/ }),

/***/ "./stories/atoms/link/link.css":
/*!*************************************!*\
  !*** ./stories/atoms/link/link.css ***!
  \*************************************/
/***/ (() => {



/***/ }),

/***/ "./stories/molecules/ButtonGroup/ButtonGroup.css":
/*!*******************************************************!*\
  !*** ./stories/molecules/ButtonGroup/ButtonGroup.css ***!
  \*******************************************************/
/***/ (() => {



/***/ }),

/***/ "./stories/molecules/ImageBox/ImageBox.css":
/*!*************************************************!*\
  !*** ./stories/molecules/ImageBox/ImageBox.css ***!
  \*************************************************/
/***/ (() => {



/***/ }),

/***/ "./stories/molecules/SearchBox/SearchBox.css":
/*!***************************************************!*\
  !*** ./stories/molecules/SearchBox/SearchBox.css ***!
  \***************************************************/
/***/ (() => {



/***/ }),

/***/ "./stories/molecules/TextBox/TextBox.css":
/*!***********************************************!*\
  !*** ./stories/molecules/TextBox/TextBox.css ***!
  \***********************************************/
/***/ (() => {



/***/ }),

/***/ "./stories/organisms/Editor/MenuBar.scss":
/*!***********************************************!*\
  !*** ./stories/organisms/Editor/MenuBar.scss ***!
  \***********************************************/
/***/ (() => {



/***/ }),

/***/ "./stories/organisms/Editor/MenuItem.scss":
/*!************************************************!*\
  !*** ./stories/organisms/Editor/MenuItem.scss ***!
  \************************************************/
/***/ (() => {



/***/ }),

/***/ "./stories/organisms/Editor/styles.scss":
/*!**********************************************!*\
  !*** ./stories/organisms/Editor/styles.scss ***!
  \**********************************************/
/***/ (() => {



/***/ }),

/***/ "./stories/organisms/Header/Header.css":
/*!*********************************************!*\
  !*** ./stories/organisms/Header/Header.css ***!
  \*********************************************/
/***/ (() => {



/***/ }),

/***/ "./stories/organisms/LeftNav/LeftNav.css":
/*!***********************************************!*\
  !*** ./stories/organisms/LeftNav/LeftNav.css ***!
  \***********************************************/
/***/ (() => {



/***/ }),

/***/ "./stories/organisms/RightNav/RightNav.css":
/*!*************************************************!*\
  !*** ./stories/organisms/RightNav/RightNav.css ***!
  \*************************************************/
/***/ (() => {



/***/ }),

/***/ "./stories/organisms/article/Article.css":
/*!***********************************************!*\
  !*** ./stories/organisms/article/Article.css ***!
  \***********************************************/
/***/ (() => {



/***/ }),

/***/ "./stories/pages/MainPage/MainPage.css":
/*!*********************************************!*\
  !*** ./stories/pages/MainPage/MainPage.css ***!
  \*********************************************/
/***/ (() => {



/***/ }),

/***/ "./stories/pages/ReadOrWritePage/ReadOrWritePage.scss":
/*!************************************************************!*\
  !*** ./stories/pages/ReadOrWritePage/ReadOrWritePage.scss ***!
  \************************************************************/
/***/ (() => {



/***/ }),

/***/ "next/head":
/*!****************************!*\
  !*** external "next/head" ***!
  \****************************/
/***/ ((module) => {

"use strict";
module.exports = require("next/head");

/***/ }),

/***/ "react":
/*!************************!*\
  !*** external "react" ***!
  \************************/
/***/ ((module) => {

"use strict";
module.exports = require("react");

/***/ }),

/***/ "react/jsx-dev-runtime":
/*!****************************************!*\
  !*** external "react/jsx-dev-runtime" ***!
  \****************************************/
/***/ ((module) => {

"use strict";
module.exports = require("react/jsx-dev-runtime");

/***/ })

};
;

// load runtime
var __webpack_require__ = require("../webpack-runtime.js");
__webpack_require__.C(exports);
var __webpack_exec__ = (moduleId) => (__webpack_require__(__webpack_require__.s = moduleId))
var __webpack_exports__ = (__webpack_exec__("./pages/_app.tsx"));
module.exports = __webpack_exports__;

})();
//# sourceMappingURL=data:application/json;charset=utf-8;base64,eyJ2ZXJzaW9uIjozLCJmaWxlIjoicGFnZXMvX2FwcC5qcyIsIm1hcHBpbmdzIjoiOzs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7O0FBQUE7QUFDQTtBQUNBO0FBQ0E7QUFDQTtBQUVBO0FBQ0E7QUFDQTtBQUNBO0FBRUE7QUFDQTtBQUNBO0FBQ0E7QUFDQTtBQUNBO0FBQ0E7QUFFQTtBQUNBO0FBR0E7QUFDQTs7OztBQUVBLFNBQVNFLEtBQVQsQ0FBZTtBQUFFQyxFQUFBQSxTQUFGO0FBQWFDLEVBQUFBO0FBQWIsQ0FBZixFQUFtRDtBQUNqRCxzQkFDRTtBQUFBLDRCQUNFLCtEQUFDLG1EQUFEO0FBQUEsOEJBQ0U7QUFBTSxZQUFJLEVBQUMsVUFBWDtBQUFzQixlQUFPLEVBQUM7QUFBOUI7QUFBQTtBQUFBO0FBQUE7QUFBQSxjQURGLGVBRUU7QUFBQTtBQUFBO0FBQUE7QUFBQTtBQUFBO0FBQUEsY0FGRjtBQUFBO0FBQUE7QUFBQTtBQUFBO0FBQUEsWUFERixlQUtFLCtEQUFDLFNBQUQsb0JBQWVBLFNBQWY7QUFBQTtBQUFBO0FBQUE7QUFBQSxZQUxGO0FBQUEsa0JBREY7QUFTRDs7QUFFRCxpRUFBZUYsS0FBZjs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7QW1CdENBOzs7Ozs7Ozs7OztBQ0FBOzs7Ozs7Ozs7OztBQ0FBIiwic291cmNlcyI6WyJ3ZWJwYWNrOi8vLy4vcGFnZXMvX2FwcC50c3giLCJ3ZWJwYWNrOi8vLy4vc3Rvcmllcy9hdG9tcy9idXR0b24vYnV0dG9uLmNzcyIsIndlYnBhY2s6Ly8vLi9zdG9yaWVzL2F0b21zL2ltYWdlL2ltYWdlQ29udGVudC5jc3MiLCJ3ZWJwYWNrOi8vLy4vc3Rvcmllcy9hdG9tcy9pbnB1dC9pbnB1dC5jc3MiLCJ3ZWJwYWNrOi8vLy4vc3Rvcmllcy9hdG9tcy9sYWJlbC9sYWJlbC5jc3MiLCJ3ZWJwYWNrOi8vLy4vc3Rvcmllcy9hdG9tcy9saW5rL2xpbmsuY3NzIiwid2VicGFjazovLy8uL3N0b3JpZXMvbW9sZWN1bGVzL0J1dHRvbkdyb3VwL0J1dHRvbkdyb3VwLmNzcyIsIndlYnBhY2s6Ly8vLi9zdG9yaWVzL21vbGVjdWxlcy9JbWFnZUJveC9JbWFnZUJveC5jc3MiLCJ3ZWJwYWNrOi8vLy4vc3Rvcmllcy9tb2xlY3VsZXMvU2VhcmNoQm94L1NlYXJjaEJveC5jc3MiLCJ3ZWJwYWNrOi8vLy4vc3Rvcmllcy9tb2xlY3VsZXMvVGV4dEJveC9UZXh0Qm94LmNzcyIsIndlYnBhY2s6Ly8vLi9zdG9yaWVzL29yZ2FuaXNtcy9FZGl0b3IvTWVudUJhci5zY3NzIiwid2VicGFjazovLy8uL3N0b3JpZXMvb3JnYW5pc21zL0VkaXRvci9NZW51SXRlbS5zY3NzIiwid2VicGFjazovLy8uL3N0b3JpZXMvb3JnYW5pc21zL0VkaXRvci9zdHlsZXMuc2NzcyIsIndlYnBhY2s6Ly8vLi9zdG9yaWVzL29yZ2FuaXNtcy9IZWFkZXIvSGVhZGVyLmNzcyIsIndlYnBhY2s6Ly8vLi9zdG9yaWVzL29yZ2FuaXNtcy9MZWZ0TmF2L0xlZnROYXYuY3NzIiwid2VicGFjazovLy8uL3N0b3JpZXMvb3JnYW5pc21zL1JpZ2h0TmF2L1JpZ2h0TmF2LmNzcyIsIndlYnBhY2s6Ly8vLi9zdG9yaWVzL29yZ2FuaXNtcy9hcnRpY2xlL0FydGljbGUuY3NzIiwid2VicGFjazovLy8uL3N0b3JpZXMvcGFnZXMvTWFpblBhZ2UvTWFpblBhZ2UuY3NzIiwid2VicGFjazovLy8uL3N0b3JpZXMvcGFnZXMvUmVhZE9yV3JpdGVQYWdlL1JlYWRPcldyaXRlUGFnZS5zY3NzIiwid2VicGFjazovLy9leHRlcm5hbCBcIm5leHQvaGVhZFwiIiwid2VicGFjazovLy9leHRlcm5hbCBcInJlYWN0XCIiLCJ3ZWJwYWNrOi8vL2V4dGVybmFsIFwicmVhY3QvanN4LWRldi1ydW50aW1lXCIiXSwic291cmNlc0NvbnRlbnQiOlsiaW1wb3J0IFwiLi4vc3Rvcmllcy9hdG9tcy9idXR0b24vYnV0dG9uLmNzc1wiO1xuaW1wb3J0IFwiLi4vc3Rvcmllcy9hdG9tcy9pbWFnZS9pbWFnZUNvbnRlbnQuY3NzXCI7XG5pbXBvcnQgXCIuLi9zdG9yaWVzL2F0b21zL2lucHV0L2lucHV0LmNzc1wiO1xuaW1wb3J0IFwiLi4vc3Rvcmllcy9hdG9tcy9sYWJlbC9sYWJlbC5jc3NcIjtcbmltcG9ydCBcIi4uL3N0b3JpZXMvYXRvbXMvbGluay9saW5rLmNzc1wiO1xuXG5pbXBvcnQgXCIuLi9zdG9yaWVzL21vbGVjdWxlcy9CdXR0b25Hcm91cC9CdXR0b25Hcm91cC5jc3NcIjtcbmltcG9ydCBcIi4uL3N0b3JpZXMvbW9sZWN1bGVzL0ltYWdlQm94L0ltYWdlQm94LmNzc1wiO1xuaW1wb3J0IFwiLi4vc3Rvcmllcy9tb2xlY3VsZXMvU2VhcmNoQm94L1NlYXJjaEJveC5jc3NcIjtcbmltcG9ydCBcIi4uL3N0b3JpZXMvbW9sZWN1bGVzL1RleHRCb3gvVGV4dEJveC5jc3NcIjtcblxuaW1wb3J0IFwiLi4vc3Rvcmllcy9vcmdhbmlzbXMvYXJ0aWNsZS9BcnRpY2xlLmNzc1wiO1xuaW1wb3J0IFwiLi4vc3Rvcmllcy9vcmdhbmlzbXMvRWRpdG9yL01lbnVCYXIuc2Nzc1wiO1xuaW1wb3J0IFwiLi4vc3Rvcmllcy9vcmdhbmlzbXMvRWRpdG9yL01lbnVJdGVtLnNjc3NcIjtcbmltcG9ydCBcIi4uL3N0b3JpZXMvb3JnYW5pc21zL0VkaXRvci9zdHlsZXMuc2Nzc1wiO1xuaW1wb3J0IFwiLi4vc3Rvcmllcy9vcmdhbmlzbXMvSGVhZGVyL0hlYWRlci5jc3NcIjtcbmltcG9ydCBcIi4uL3N0b3JpZXMvb3JnYW5pc21zL0xlZnROYXYvTGVmdE5hdi5jc3NcIjtcbmltcG9ydCBcIi4uL3N0b3JpZXMvb3JnYW5pc21zL1JpZ2h0TmF2L1JpZ2h0TmF2LmNzc1wiO1xuXG5pbXBvcnQgXCIuLi9zdG9yaWVzL3BhZ2VzL01haW5QYWdlL01haW5QYWdlLmNzc1wiO1xuaW1wb3J0IFwiLi4vc3Rvcmllcy9wYWdlcy9SZWFkT3JXcml0ZVBhZ2UvUmVhZE9yV3JpdGVQYWdlLnNjc3NcIjtcblxuaW1wb3J0IHR5cGUgeyBBcHBQcm9wcyB9IGZyb20gXCJuZXh0L2FwcFwiO1xuaW1wb3J0IFJlYWN0IGZyb20gXCJyZWFjdFwiO1xuaW1wb3J0IEhlYWQgZnJvbSBcIm5leHQvaGVhZFwiO1xuXG5mdW5jdGlvbiBNeUFwcCh7IENvbXBvbmVudCwgcGFnZVByb3BzIH06IEFwcFByb3BzKSB7XG4gIHJldHVybiAoXG4gICAgPD5cbiAgICAgIDxIZWFkPlxuICAgICAgICA8bWV0YSBuYW1lPVwidmlld3BvcnRcIiBjb250ZW50PVwid2lkdGg9ZGV2aWNlLXdpZHRoLCBpbml0aWFsLXNjYWxlPTFcIiAvPlxuICAgICAgICA8dGl0bGU+a2l3aSB3aWtpPC90aXRsZT5cbiAgICAgIDwvSGVhZD5cbiAgICAgIDxDb21wb25lbnQgey4uLnBhZ2VQcm9wc30gLz5cbiAgICA8Lz5cbiAgKTtcbn1cblxuZXhwb3J0IGRlZmF1bHQgTXlBcHA7XG4iLCIiLCIiLCIiLCIiLCIiLCIiLCIiLCIiLCIiLCIiLCIiLCIiLCIiLCIiLCIiLCIiLCIiLCIiLCJtb2R1bGUuZXhwb3J0cyA9IHJlcXVpcmUoXCJuZXh0L2hlYWRcIik7IiwibW9kdWxlLmV4cG9ydHMgPSByZXF1aXJlKFwicmVhY3RcIik7IiwibW9kdWxlLmV4cG9ydHMgPSByZXF1aXJlKFwicmVhY3QvanN4LWRldi1ydW50aW1lXCIpOyJdLCJuYW1lcyI6WyJSZWFjdCIsIkhlYWQiLCJNeUFwcCIsIkNvbXBvbmVudCIsInBhZ2VQcm9wcyJdLCJzb3VyY2VSb290IjoiIn0=