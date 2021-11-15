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
                                    className: ["buttons_edit"],
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
//# sourceMappingURL=data:application/json;charset=utf-8;base64,eyJ2ZXJzaW9uIjozLCJmaWxlIjoic3RhdGljL3dlYnBhY2svcGFnZXMvZWRpdC4xNWJkYjQzNTJlY2RmMThhYTc0MS5ob3QtdXBkYXRlLmpzIiwibWFwcGluZ3MiOiI7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7O0NBQ0E7O0FBQ0E7QUFDQTtBQUNBO0FBQ0E7QUFDQTs7QUFtQkEsSUFBTU0sbUJBQW1CLEdBQUcsQ0FDMUIsTUFEMEIsRUFFMUIsT0FGMEIsRUFHMUIsVUFIMEIsRUFJMUIsWUFKMEIsRUFLMUIsT0FMMEIsRUFNMUIsU0FOMEIsRUFPMUIsT0FQMEIsQ0FBNUIsRUFVQTs7QUFDQSxJQUFNQyxLQUFLLEdBQUcsd0JBQWQ7QUFFQSxJQUFNQyxXQUFXLEdBQUcsQ0FBQyxJQUFELEVBQU8sSUFBUCxDQUFwQjtBQUNBO0FBQ0E7QUFDQTs7QUFDQSxJQUFNQyxlQUFlLEdBQUcsU0FBbEJBLGVBQWtCO0FBQUEsTUFDdEJDLFNBRHNCLFFBQ3RCQSxTQURzQjtBQUFBLE1BRXRCQyxLQUZzQixRQUV0QkEsS0FGc0I7QUFBQSxNQUd0QkMsT0FIc0IsUUFHdEJBLE9BSHNCO0FBQUEsc0JBS3RCO0FBQ0UsU0FBSyxFQUFFRCxLQURUO0FBRUUsYUFBUywrQ0FBd0NELFNBQVMsQ0FBQ0csSUFBVixDQUFlLEdBQWYsQ0FBeEMsQ0FGWDtBQUdFLFdBQU8sRUFBRUQsT0FIWDtBQUlFLG1CQUFZLE1BSmQ7QUFBQSw0QkFNRSw4REFBQywrREFBRDtBQUFTLFdBQUssRUFBRUw7QUFBaEI7QUFBQTtBQUFBO0FBQUE7QUFBQSxhQU5GLGVBT0U7QUFBSyxlQUFTLEVBQUMsb0NBQWY7QUFBQSw4QkFDRSw4REFBQyw2REFBRDtBQUFRLGVBQU8sRUFBRUQ7QUFBakI7QUFBQTtBQUFBO0FBQUE7QUFBQSxlQURGLGVBRUU7QUFBSyxpQkFBUyxFQUFDLHNDQUFmO0FBQUEsZ0NBQ0U7QUFBSyxtQkFBUyxFQUFDLHFDQUFmO0FBQUEsa0NBQ0UsOERBQUMsNERBQUQ7QUFBQTtBQUFBO0FBQUE7QUFBQSxtQkFERixlQUVFLDhEQUFDLHVFQUFEO0FBQWEsbUJBQU8sRUFBRUUsV0FBdEI7QUFBbUMscUJBQVMsRUFBRSxDQUFDLGNBQUQ7QUFBOUM7QUFBQTtBQUFBO0FBQUE7QUFBQSxtQkFGRjtBQUFBO0FBQUE7QUFBQTtBQUFBO0FBQUEsaUJBREYsZUFNRSw4REFBQyxpRUFBRDtBQUFBO0FBQUE7QUFBQTtBQUFBLGlCQU5GO0FBQUE7QUFBQTtBQUFBO0FBQUE7QUFBQSxlQUZGO0FBQUE7QUFBQTtBQUFBO0FBQUE7QUFBQSxhQVBGO0FBQUE7QUFBQTtBQUFBO0FBQUE7QUFBQSxXQUxzQjtBQUFBLENBQXhCO0FBMEJBO0FBQ0E7QUFDQTs7O0tBNUJNQztBQTZCTkEsZUFBZSxDQUFDSyxZQUFoQixHQUErQjtBQUM3QkosRUFBQUEsU0FBUyxFQUFFLEVBRGtCO0FBRTdCQyxFQUFBQSxLQUFLLEVBQUUsRUFGc0I7QUFHN0JDLEVBQUFBLE9BQU8sRUFBRSxtQkFBTSxDQUFFO0FBSFksQ0FBL0I7QUFNQSwrREFBZUgsZUFBZiIsInNvdXJjZXMiOlsid2VicGFjazovL19OX0UvLi9zdG9yaWVzL3BhZ2VzL1JlYWRPcldyaXRlUGFnZS9SZWFkT3JXcml0ZVBhZ2UudHN4Il0sInNvdXJjZXNDb250ZW50IjpbImltcG9ydCBSZWFjdCBmcm9tIFwicmVhY3RcIjtcbi8vIGltcG9ydCBcIi4vUmVhZE9yV3JpdGVQYWdlLnNjc3NcIjtcbmltcG9ydCBMZWZ0TmF2IGZyb20gXCIuLi8uLi9vcmdhbmlzbXMvTGVmdE5hdi9MZWZ0TmF2XCI7XG5pbXBvcnQgUmlnaHROYXYgZnJvbSBcIi4uLy4uL29yZ2FuaXNtcy9SaWdodE5hdi9SaWdodE5hdlwiO1xuaW1wb3J0IEhlYWRlciBmcm9tIFwiLi4vLi4vb3JnYW5pc21zL0hlYWRlci9IZWFkZXJcIjtcbmltcG9ydCBFZGl0b3IgZnJvbSBcIi4uLy4uL29yZ2FuaXNtcy9FZGl0b3IvaW5kZXhcIjtcbmltcG9ydCBCdXR0b25Hcm91cCBmcm9tIFwiLi4vLi4vbW9sZWN1bGVzL0J1dHRvbkdyb3VwL0J1dHRvbkdyb3VwXCI7XG5cbmludGVyZmFjZSBSZWFkT3JXcml0ZVBhZ2VQcm9wcyB7XG4gIC8qKlxuICAgKiBSZWFjdCBjbGFzc05hbWUg7ISk7KCVXG4gICAqL1xuICBjbGFzc05hbWU/OiBzdHJpbmdbXTtcblxuICAvKipcbiAgICog7YG066atIO2VuOuTpOufrFxuICAgKi9cbiAgb25DbGljaz86ICgpID0+IHZvaWQ7XG5cbiAgLyoqXG4gICAqIHN0eWxlIOyEpOyglVxuICAgKi9cbiAgc3R5bGU/OiBvYmplY3Q7XG59XG5cbmNvbnN0IEJ1dHRvbmdyb3VwRXhhbXBsZTEgPSBbXG4gIFwiSG9tZVwiLFxuICBcIkNsb3VkXCIsXG4gIFwiUGxhdGZvcm1cIixcbiAgXCJDb25uZWN0b3JzXCIsXG4gIFwiVG9vbHNcIixcbiAgXCJDbGllbnRzXCIsXG4gIFwiTG9naW5cIixcbl07XG5cbi8vIGNvbnN0IGltYWdlID0gXCIvcHVibGljL3N0YXRpYy9sb2dvcy9sb2dvLnBuZ1wiO1xuY29uc3QgaW1hZ2UgPSBcIi9zdGF0aWMvbG9nb3MvbG9nby5wbmdcIjtcblxuY29uc3QgZWRpdEJ1dHRvbnMgPSBbXCLrk7HroZ1cIiwgXCLsiJjsoJVcIl07XG4vKipcbiAqIFByaW1hcnkgVUkgY29tcG9uZW50IGZvciB1c2VyIGludGVyYWN0aW9uXG4gKi9cbmNvbnN0IFJlYWRPcldyaXRlUGFnZSA9ICh7XG4gIGNsYXNzTmFtZSxcbiAgc3R5bGUsXG4gIG9uQ2xpY2ssXG59OiBSZWFkT3JXcml0ZVBhZ2VQcm9wcykgPT4gKFxuICA8ZGl2XG4gICAgc3R5bGU9e3N0eWxlfVxuICAgIGNsYXNzTmFtZT17YFJlYWRPcldyaXRlUGFnZV9zdHJ1Y3R1cmVfd2hvbGVCb3ggJHtjbGFzc05hbWUuam9pbihcIiBcIil9YH1cbiAgICBvbkNsaWNrPXtvbkNsaWNrfVxuICAgIGFyaWEtaGlkZGVuPVwidHJ1ZVwiXG4gID5cbiAgICA8TGVmdE5hdiBpbWFnZT17aW1hZ2V9IC8+XG4gICAgPGRpdiBjbGFzc05hbWU9XCJSZWFkT3JXcml0ZVBhZ2Vfc3RydWN0dXJlX3JpZ2h0Qm94XCI+XG4gICAgICA8SGVhZGVyIGJ1dHRvbnM9e0J1dHRvbmdyb3VwRXhhbXBsZTF9IC8+XG4gICAgICA8ZGl2IGNsYXNzTmFtZT1cIlJlYWRPcldyaXRlUGFnZV9zdHJ1Y3R1cmVfcmlnaHRCb3hfMlwiPlxuICAgICAgICA8ZGl2IGNsYXNzTmFtZT1cIlJlYWRPcldyaXRlUGFnZV9zdHJ1Y3R1cmVfbGVmdEJveF8yXCI+XG4gICAgICAgICAgPEVkaXRvciAvPlxuICAgICAgICAgIDxCdXR0b25Hcm91cCBidXR0b25zPXtlZGl0QnV0dG9uc30gY2xhc3NOYW1lPXtbXCJidXR0b25zX2VkaXRcIl19Lz5cbiAgICAgICAgPC9kaXY+XG4gICAgICAgIFxuICAgICAgICA8UmlnaHROYXYgLz5cbiAgICAgIDwvZGl2PlxuICAgIDwvZGl2PlxuICA8L2Rpdj5cbik7XG5cbi8qKlxuICogcmVhY3QvcmVxdWlyZS1kZWZhdWx0LXByb3BzXG4gKi9cblJlYWRPcldyaXRlUGFnZS5kZWZhdWx0UHJvcHMgPSB7XG4gIGNsYXNzTmFtZTogW10sXG4gIHN0eWxlOiB7fSxcbiAgb25DbGljazogKCkgPT4ge30sXG59O1xuXG5leHBvcnQgZGVmYXVsdCBSZWFkT3JXcml0ZVBhZ2U7XG4iXSwibmFtZXMiOlsiUmVhY3QiLCJMZWZ0TmF2IiwiUmlnaHROYXYiLCJIZWFkZXIiLCJFZGl0b3IiLCJCdXR0b25Hcm91cCIsIkJ1dHRvbmdyb3VwRXhhbXBsZTEiLCJpbWFnZSIsImVkaXRCdXR0b25zIiwiUmVhZE9yV3JpdGVQYWdlIiwiY2xhc3NOYW1lIiwic3R5bGUiLCJvbkNsaWNrIiwiam9pbiIsImRlZmF1bHRQcm9wcyJdLCJzb3VyY2VSb290IjoiIn0=
