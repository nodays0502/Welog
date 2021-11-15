"use strict";
self["webpackHotUpdate_N_E"]("pages/edit", {
  /***/ "./stories/pages/ReadOrWritePage/ReadOrWritePage.tsx":
    /*!***********************************************************!*\
  !*** ./stories/pages/ReadOrWritePage/ReadOrWritePage.tsx ***!
  \***********************************************************/
    /***/ function (module, __webpack_exports__, __webpack_require__) {
      __webpack_require__.r(__webpack_exports__);
      /* harmony import */ var react__WEBPACK_IMPORTED_MODULE_0__ =
        __webpack_require__(
          /*! react */ "./.yarn/cache/react-npm-17.0.2-99ba37d931-b254cc17ce.zip/node_modules/react/index.js"
        );
      /* harmony import */ var react__WEBPACK_IMPORTED_MODULE_0___default =
        /*#__PURE__*/ __webpack_require__.n(react__WEBPACK_IMPORTED_MODULE_0__);
      /* harmony import */ var _organisms_LeftNav_LeftNav__WEBPACK_IMPORTED_MODULE_1__ =
        __webpack_require__(
          /*! ../../organisms/LeftNav/LeftNav */ "./stories/organisms/LeftNav/LeftNav.tsx"
        );
      /* harmony import */ var _organisms_RightNav_RightNav__WEBPACK_IMPORTED_MODULE_2__ =
        __webpack_require__(
          /*! ../../organisms/RightNav/RightNav */ "./stories/organisms/RightNav/RightNav.tsx"
        );
      /* harmony import */ var _organisms_Header_Header__WEBPACK_IMPORTED_MODULE_3__ =
        __webpack_require__(
          /*! ../../organisms/Header/Header */ "./stories/organisms/Header/Header.tsx"
        );
      /* harmony import */ var _organisms_Editor_index__WEBPACK_IMPORTED_MODULE_4__ =
        __webpack_require__(
          /*! ../../organisms/Editor/index */ "./stories/organisms/Editor/index.tsx"
        );
      /* harmony import */ var _molecules_ButtonGroup_ButtonGroup__WEBPACK_IMPORTED_MODULE_5__ =
        __webpack_require__(
          /*! ../../molecules/ButtonGroup/ButtonGroup */ "./stories/molecules/ButtonGroup/ButtonGroup.tsx"
        );
      /* harmony import */ var react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_6__ =
        __webpack_require__(
          /*! react/jsx-dev-runtime */ "./.yarn/cache/react-npm-17.0.2-99ba37d931-b254cc17ce.zip/node_modules/react/jsx-dev-runtime.js"
        );
      /* harmony import */ var react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_6___default =
        /*#__PURE__*/ __webpack_require__.n(
          react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_6__
        );
      /* module decorator */ module = __webpack_require__.hmd(module);
      var _jsxFileName =
          "D:\\self_project\\self_project_frontend\\stories\\pages\\ReadOrWritePage\\ReadOrWritePage.tsx",
        _this = undefined;

      // import "./ReadOrWritePage.scss";

      var ButtongroupExample1 = [
        "Home",
        "Cloud",
        "Platform",
        "Connectors",
        "Tools",
        "Clients",
        "Login",
      ]; // const image = "/public/static/logos/logo.png";

      var image = "/static/logos/logo.png";
      var editButtons = ["등록", "수정"];
      /**
       * Primary UI component for user interaction
       */

      var ReadOrWritePage = function ReadOrWritePage(_ref) {
        var className = _ref.className,
          style = _ref.style,
          onClick = _ref.onClick;
        return /*#__PURE__*/ (0,
        react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_6__.jsxDEV)(
          "div",
          {
            style: style,
            className: "ReadOrWritePage_structure_wholeBox ".concat(
              className.join(" ")
            ),
            onClick: onClick,
            "aria-hidden": "true",
            children: [
              /*#__PURE__*/ (0,
              react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_6__.jsxDEV)(
                _organisms_LeftNav_LeftNav__WEBPACK_IMPORTED_MODULE_1__.default,
                {
                  image: image,
                },
                void 0,
                false,
                {
                  fileName: _jsxFileName,
                  lineNumber: 54,
                  columnNumber: 5,
                },
                _this
              ),
              /*#__PURE__*/ (0,
              react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_6__.jsxDEV)(
                "div",
                {
                  className: "ReadOrWritePage_structure_rightBox",
                  children: [
                    /*#__PURE__*/ (0,
                    react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_6__.jsxDEV)(
                      _organisms_Header_Header__WEBPACK_IMPORTED_MODULE_3__.default,
                      {
                        buttons: ButtongroupExample1,
                      },
                      void 0,
                      false,
                      {
                        fileName: _jsxFileName,
                        lineNumber: 56,
                        columnNumber: 7,
                      },
                      _this
                    ),
                    /*#__PURE__*/ (0,
                    react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_6__.jsxDEV)(
                      "div",
                      {
                        className: "ReadOrWritePage_structure_rightBox_2",
                        children: [
                          /*#__PURE__*/ (0,
                          react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_6__.jsxDEV)(
                            "div",
                            {
                              className: "ReadOrWritePage_structure_leftBox_2",
                              children: [
                                /*#__PURE__*/ (0,
                                react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_6__.jsxDEV)(
                                  _organisms_Editor_index__WEBPACK_IMPORTED_MODULE_4__.default,
                                  {},
                                  void 0,
                                  false,
                                  {
                                    fileName: _jsxFileName,
                                    lineNumber: 59,
                                    columnNumber: 11,
                                  },
                                  _this
                                ),
                                /*#__PURE__*/ (0,
                                react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_6__.jsxDEV)(
                                  _molecules_ButtonGroup_ButtonGroup__WEBPACK_IMPORTED_MODULE_5__.default,
                                  {
                                    buttons: editButtons,
                                    className: ".buttons_edit",
                                  },
                                  void 0,
                                  false,
                                  {
                                    fileName: _jsxFileName,
                                    lineNumber: 60,
                                    columnNumber: 11,
                                  },
                                  _this
                                ),
                              ],
                            },
                            void 0,
                            true,
                            {
                              fileName: _jsxFileName,
                              lineNumber: 58,
                              columnNumber: 9,
                            },
                            _this
                          ),
                          /*#__PURE__*/ (0,
                          react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_6__.jsxDEV)(
                            _organisms_RightNav_RightNav__WEBPACK_IMPORTED_MODULE_2__.default,
                            {},
                            void 0,
                            false,
                            {
                              fileName: _jsxFileName,
                              lineNumber: 63,
                              columnNumber: 9,
                            },
                            _this
                          ),
                        ],
                      },
                      void 0,
                      true,
                      {
                        fileName: _jsxFileName,
                        lineNumber: 57,
                        columnNumber: 7,
                      },
                      _this
                    ),
                  ],
                },
                void 0,
                true,
                {
                  fileName: _jsxFileName,
                  lineNumber: 55,
                  columnNumber: 5,
                },
                _this
              ),
            ],
          },
          void 0,
          true,
          {
            fileName: _jsxFileName,
            lineNumber: 48,
            columnNumber: 3,
          },
          _this
        );
      };
      /**
       * react/require-default-props
       */

      _c = ReadOrWritePage;
      ReadOrWritePage.defaultProps = {
        className: [],
        style: {},
        onClick: function onClick() {},
      };
      /* harmony default export */ __webpack_exports__["default"] =
        ReadOrWritePage;

      var _c;

      $RefreshReg$(_c, "ReadOrWritePage");

      var _a, _b;
      // Legacy CSS implementations will `eval` browser code in a Node.js context
      // to extract CSS. For backwards compatibility, we need to check we're in a
      // browser context before continuing.
      if (
        typeof self !== "undefined" &&
        // AMP / No-JS mode does not inject these helpers:
        "$RefreshHelpers$" in self
      ) {
        var currentExports = module.__proto__.exports;
        var prevExports =
          (_b =
            (_a = module.hot.data) === null || _a === void 0
              ? void 0
              : _a.prevExports) !== null && _b !== void 0
            ? _b
            : null;
        // This cannot happen in MainTemplate because the exports mismatch between
        // templating and execution.
        self.$RefreshHelpers$.registerExportsForReactRefresh(
          currentExports,
          module.id
        );
        // A module can be accepted automatically based on its exports, e.g. when
        // it is a Refresh Boundary.
        if (self.$RefreshHelpers$.isReactRefreshBoundary(currentExports)) {
          // Save the previous exports on update so we can compare the boundary
          // signatures.
          module.hot.dispose(function (data) {
            data.prevExports = currentExports;
          });
          // Unconditionally accept an update to this module, we'll check if it's
          // still a Refresh Boundary later.
          module.hot.accept();
          // This field is set when the previous version of this module was a
          // Refresh Boundary, letting us know we need to check for invalidation or
          // enqueue an update.
          if (prevExports !== null) {
            // A boundary can become ineligible if its exports are incompatible
            // with the previous exports.
            //
            // For example, if you add/remove/change exports, we'll want to
            // re-execute the importing modules, and force those components to
            // re-render. Similarly, if you convert a class component to a
            // function, we want to invalidate the boundary.
            if (
              self.$RefreshHelpers$.shouldInvalidateReactRefreshBoundary(
                prevExports,
                currentExports
              )
            ) {
              module.hot.invalidate();
            } else {
              self.$RefreshHelpers$.scheduleUpdate();
            }
          }
        } else {
          // Since we just executed the code for the module, it's possible that the
          // new exports made it ineligible for being a boundary.
          // We only care about the case when we were _previously_ a boundary,
          // because we already accepted this update (accidental side effect).
          var isNoLongerABoundary = prevExports !== null;
          if (isNoLongerABoundary) {
            module.hot.invalidate();
          }
        }
      }

      /***/
    },
});
//# sourceMappingURL=data:application/json;charset=utf-8;base64,eyJ2ZXJzaW9uIjozLCJmaWxlIjoic3RhdGljL3dlYnBhY2svcGFnZXMvZWRpdC5jMWExZjIwYTk1ZTUyYmFlMTQzNC5ob3QtdXBkYXRlLmpzIiwibWFwcGluZ3MiOiI7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7O0NBQ0E7O0FBQ0E7QUFDQTtBQUNBO0FBQ0E7QUFDQTs7QUFtQkEsSUFBTU0sbUJBQW1CLEdBQUcsQ0FDMUIsTUFEMEIsRUFFMUIsT0FGMEIsRUFHMUIsVUFIMEIsRUFJMUIsWUFKMEIsRUFLMUIsT0FMMEIsRUFNMUIsU0FOMEIsRUFPMUIsT0FQMEIsQ0FBNUIsRUFVQTs7QUFDQSxJQUFNQyxLQUFLLEdBQUcsd0JBQWQ7QUFFQSxJQUFNQyxXQUFXLEdBQUcsQ0FBQyxJQUFELEVBQU8sSUFBUCxDQUFwQjtBQUNBO0FBQ0E7QUFDQTs7QUFDQSxJQUFNQyxlQUFlLEdBQUcsU0FBbEJBLGVBQWtCO0FBQUEsTUFDdEJDLFNBRHNCLFFBQ3RCQSxTQURzQjtBQUFBLE1BRXRCQyxLQUZzQixRQUV0QkEsS0FGc0I7QUFBQSxNQUd0QkMsT0FIc0IsUUFHdEJBLE9BSHNCO0FBQUEsc0JBS3RCO0FBQ0UsU0FBSyxFQUFFRCxLQURUO0FBRUUsYUFBUywrQ0FBd0NELFNBQVMsQ0FBQ0csSUFBVixDQUFlLEdBQWYsQ0FBeEMsQ0FGWDtBQUdFLFdBQU8sRUFBRUQsT0FIWDtBQUlFLG1CQUFZLE1BSmQ7QUFBQSw0QkFNRSw4REFBQywrREFBRDtBQUFTLFdBQUssRUFBRUw7QUFBaEI7QUFBQTtBQUFBO0FBQUE7QUFBQSxhQU5GLGVBT0U7QUFBSyxlQUFTLEVBQUMsb0NBQWY7QUFBQSw4QkFDRSw4REFBQyw2REFBRDtBQUFRLGVBQU8sRUFBRUQ7QUFBakI7QUFBQTtBQUFBO0FBQUE7QUFBQSxlQURGLGVBRUU7QUFBSyxpQkFBUyxFQUFDLHNDQUFmO0FBQUEsZ0NBQ0U7QUFBSyxtQkFBUyxFQUFDLHFDQUFmO0FBQUEsa0NBQ0UsOERBQUMsNERBQUQ7QUFBQTtBQUFBO0FBQUE7QUFBQSxtQkFERixlQUVFLDhEQUFDLHVFQUFEO0FBQWEsbUJBQU8sRUFBRUUsV0FBdEI7QUFBbUMscUJBQVMsRUFBRTtBQUE5QztBQUFBO0FBQUE7QUFBQTtBQUFBLG1CQUZGO0FBQUE7QUFBQTtBQUFBO0FBQUE7QUFBQSxpQkFERixlQU1FLDhEQUFDLGlFQUFEO0FBQUE7QUFBQTtBQUFBO0FBQUEsaUJBTkY7QUFBQTtBQUFBO0FBQUE7QUFBQTtBQUFBLGVBRkY7QUFBQTtBQUFBO0FBQUE7QUFBQTtBQUFBLGFBUEY7QUFBQTtBQUFBO0FBQUE7QUFBQTtBQUFBLFdBTHNCO0FBQUEsQ0FBeEI7QUEwQkE7QUFDQTtBQUNBOzs7S0E1Qk1DO0FBNkJOQSxlQUFlLENBQUNLLFlBQWhCLEdBQStCO0FBQzdCSixFQUFBQSxTQUFTLEVBQUUsRUFEa0I7QUFFN0JDLEVBQUFBLEtBQUssRUFBRSxFQUZzQjtBQUc3QkMsRUFBQUEsT0FBTyxFQUFFLG1CQUFNLENBQUU7QUFIWSxDQUEvQjtBQU1BLCtEQUFlSCxlQUFmIiwic291cmNlcyI6WyJ3ZWJwYWNrOi8vX05fRS8uL3N0b3JpZXMvcGFnZXMvUmVhZE9yV3JpdGVQYWdlL1JlYWRPcldyaXRlUGFnZS50c3giXSwic291cmNlc0NvbnRlbnQiOlsiaW1wb3J0IFJlYWN0IGZyb20gXCJyZWFjdFwiO1xuLy8gaW1wb3J0IFwiLi9SZWFkT3JXcml0ZVBhZ2Uuc2Nzc1wiO1xuaW1wb3J0IExlZnROYXYgZnJvbSBcIi4uLy4uL29yZ2FuaXNtcy9MZWZ0TmF2L0xlZnROYXZcIjtcbmltcG9ydCBSaWdodE5hdiBmcm9tIFwiLi4vLi4vb3JnYW5pc21zL1JpZ2h0TmF2L1JpZ2h0TmF2XCI7XG5pbXBvcnQgSGVhZGVyIGZyb20gXCIuLi8uLi9vcmdhbmlzbXMvSGVhZGVyL0hlYWRlclwiO1xuaW1wb3J0IEVkaXRvciBmcm9tIFwiLi4vLi4vb3JnYW5pc21zL0VkaXRvci9pbmRleFwiO1xuaW1wb3J0IEJ1dHRvbkdyb3VwIGZyb20gXCIuLi8uLi9tb2xlY3VsZXMvQnV0dG9uR3JvdXAvQnV0dG9uR3JvdXBcIjtcblxuaW50ZXJmYWNlIFJlYWRPcldyaXRlUGFnZVByb3BzIHtcbiAgLyoqXG4gICAqIFJlYWN0IGNsYXNzTmFtZSDshKTsoJVcbiAgICovXG4gIGNsYXNzTmFtZT86IHN0cmluZ1tdO1xuXG4gIC8qKlxuICAgKiDtgbTrpq0g7ZW465Ok65+sXG4gICAqL1xuICBvbkNsaWNrPzogKCkgPT4gdm9pZDtcblxuICAvKipcbiAgICogc3R5bGUg7ISk7KCVXG4gICAqL1xuICBzdHlsZT86IG9iamVjdDtcbn1cblxuY29uc3QgQnV0dG9uZ3JvdXBFeGFtcGxlMSA9IFtcbiAgXCJIb21lXCIsXG4gIFwiQ2xvdWRcIixcbiAgXCJQbGF0Zm9ybVwiLFxuICBcIkNvbm5lY3RvcnNcIixcbiAgXCJUb29sc1wiLFxuICBcIkNsaWVudHNcIixcbiAgXCJMb2dpblwiLFxuXTtcblxuLy8gY29uc3QgaW1hZ2UgPSBcIi9wdWJsaWMvc3RhdGljL2xvZ29zL2xvZ28ucG5nXCI7XG5jb25zdCBpbWFnZSA9IFwiL3N0YXRpYy9sb2dvcy9sb2dvLnBuZ1wiO1xuXG5jb25zdCBlZGl0QnV0dG9ucyA9IFtcIuuTseuhnVwiLCBcIuyImOyglVwiXTtcbi8qKlxuICogUHJpbWFyeSBVSSBjb21wb25lbnQgZm9yIHVzZXIgaW50ZXJhY3Rpb25cbiAqL1xuY29uc3QgUmVhZE9yV3JpdGVQYWdlID0gKHtcbiAgY2xhc3NOYW1lLFxuICBzdHlsZSxcbiAgb25DbGljayxcbn06IFJlYWRPcldyaXRlUGFnZVByb3BzKSA9PiAoXG4gIDxkaXZcbiAgICBzdHlsZT17c3R5bGV9XG4gICAgY2xhc3NOYW1lPXtgUmVhZE9yV3JpdGVQYWdlX3N0cnVjdHVyZV93aG9sZUJveCAke2NsYXNzTmFtZS5qb2luKFwiIFwiKX1gfVxuICAgIG9uQ2xpY2s9e29uQ2xpY2t9XG4gICAgYXJpYS1oaWRkZW49XCJ0cnVlXCJcbiAgPlxuICAgIDxMZWZ0TmF2IGltYWdlPXtpbWFnZX0gLz5cbiAgICA8ZGl2IGNsYXNzTmFtZT1cIlJlYWRPcldyaXRlUGFnZV9zdHJ1Y3R1cmVfcmlnaHRCb3hcIj5cbiAgICAgIDxIZWFkZXIgYnV0dG9ucz17QnV0dG9uZ3JvdXBFeGFtcGxlMX0gLz5cbiAgICAgIDxkaXYgY2xhc3NOYW1lPVwiUmVhZE9yV3JpdGVQYWdlX3N0cnVjdHVyZV9yaWdodEJveF8yXCI+XG4gICAgICAgIDxkaXYgY2xhc3NOYW1lPVwiUmVhZE9yV3JpdGVQYWdlX3N0cnVjdHVyZV9sZWZ0Qm94XzJcIj5cbiAgICAgICAgICA8RWRpdG9yIC8+XG4gICAgICAgICAgPEJ1dHRvbkdyb3VwIGJ1dHRvbnM9e2VkaXRCdXR0b25zfSBjbGFzc05hbWU9e1wiLmJ1dHRvbnNfZWRpdFwifS8+XG4gICAgICAgIDwvZGl2PlxuICAgICAgICBcbiAgICAgICAgPFJpZ2h0TmF2IC8+XG4gICAgICA8L2Rpdj5cbiAgICA8L2Rpdj5cbiAgPC9kaXY+XG4pO1xuXG4vKipcbiAqIHJlYWN0L3JlcXVpcmUtZGVmYXVsdC1wcm9wc1xuICovXG5SZWFkT3JXcml0ZVBhZ2UuZGVmYXVsdFByb3BzID0ge1xuICBjbGFzc05hbWU6IFtdLFxuICBzdHlsZToge30sXG4gIG9uQ2xpY2s6ICgpID0+IHt9LFxufTtcblxuZXhwb3J0IGRlZmF1bHQgUmVhZE9yV3JpdGVQYWdlO1xuIl0sIm5hbWVzIjpbIlJlYWN0IiwiTGVmdE5hdiIsIlJpZ2h0TmF2IiwiSGVhZGVyIiwiRWRpdG9yIiwiQnV0dG9uR3JvdXAiLCJCdXR0b25ncm91cEV4YW1wbGUxIiwiaW1hZ2UiLCJlZGl0QnV0dG9ucyIsIlJlYWRPcldyaXRlUGFnZSIsImNsYXNzTmFtZSIsInN0eWxlIiwib25DbGljayIsImpvaW4iLCJkZWZhdWx0UHJvcHMiXSwic291cmNlUm9vdCI6IiJ9
