(window.webpackJsonp = window.webpackJsonp || []).push([
  [1],
  {
    1030: function (module, exports, __webpack_require__) {
      "use strict";
      (function (module) {
        (0, __webpack_require__(402).configure)(
          [__webpack_require__(1031), __webpack_require__(1032)],
          module,
          !1
        );
      }.call(this, __webpack_require__(136)(module)));
    },
    1031: function (module, exports) {
      function webpackEmptyContext(req) {
        var e = new Error("Cannot find module '" + req + "'");
        throw ((e.code = "MODULE_NOT_FOUND"), e);
      }
      (webpackEmptyContext.keys = function () {
        return [];
      }),
        (webpackEmptyContext.resolve = webpackEmptyContext),
        (module.exports = webpackEmptyContext),
        (webpackEmptyContext.id = 1031);
    },
    1032: function (module, exports, __webpack_require__) {
      var map = {
        "./atoms/button/Button.stories.tsx": 1051,
        "./atoms/label/Label.stories.tsx": 1052,
        "./atoms/link/Link.stories.tsx": 1040,
      };
      function webpackContext(req) {
        var id = webpackContextResolve(req);
        return __webpack_require__(id);
      }
      function webpackContextResolve(req) {
        if (!__webpack_require__.o(map, req)) {
          var e = new Error("Cannot find module '" + req + "'");
          throw ((e.code = "MODULE_NOT_FOUND"), e);
        }
        return map[req];
      }
      (webpackContext.keys = function webpackContextKeys() {
        return Object.keys(map);
      }),
        (webpackContext.resolve = webpackContextResolve),
        (module.exports = webpackContext),
        (webpackContext.id = 1032);
    },
    1034: function (module, exports, __webpack_require__) {
      var api = __webpack_require__(538),
        content = __webpack_require__(1035);
      "string" ==
        typeof (content = content.__esModule ? content.default : content) &&
        (content = [[module.i, content, ""]]);
      var options = { insert: "head", singleton: !1 };
      api(content, options);
      module.exports = content.locals || {};
    },
    1035: function (module, exports, __webpack_require__) {
      var ___CSS_LOADER_API_IMPORT___ = __webpack_require__(539),
        ___CSS_LOADER_GET_URL_IMPORT___ = __webpack_require__(1036),
        ___CSS_LOADER_URL_IMPORT_0___ = __webpack_require__(1037);
      exports = ___CSS_LOADER_API_IMPORT___(!1);
      var ___CSS_LOADER_URL_REPLACEMENT_0___ = ___CSS_LOADER_GET_URL_IMPORT___(
        ___CSS_LOADER_URL_IMPORT_0___
      );
      exports.push([
        module.i,
        "@font-face {\n  font-family: 'NunitoSans';\n  src: url(" +
          ___CSS_LOADER_URL_REPLACEMENT_0___ +
          ");\n}\n\n.button_hover:hover {\n  background: #DFE1E6;\n}\n\n.button_default {\n  padding: 2vw 10vh;\n  font-family: NunitoSans;\n  font-size: 1.4vw;\n  border-style: none;\n  background: white;\n  border-radius: 15px;\n}\n\n.button_default:hover{\n  cursor:pointer;\n}\n\n.button_Ghost {\n  border: 1px solid #DFE1E6;\n}\n\n.button_Outline {\n  color: black;\n  font-weight: 600;\n  border: 1px solid #DFE1E6;\n}\n\n.button_Text {\n  border: none;\n}\n.button_Destructive {\n  border: none;\n  color: red;\n  font-weight: 600;\n}",
        "",
      ]),
        (module.exports = exports);
    },
    1037: function (module, exports, __webpack_require__) {
      module.exports =
        __webpack_require__.p + "static/media/NunitoSans-Light.4cffb080.ttf";
    },
    1038: function (module, exports, __webpack_require__) {
      var api = __webpack_require__(538),
        content = __webpack_require__(1039);
      "string" ==
        typeof (content = content.__esModule ? content.default : content) &&
        (content = [[module.i, content, ""]]);
      var options = { insert: "head", singleton: !1 };
      api(content, options);
      module.exports = content.locals || {};
    },
    1039: function (module, exports, __webpack_require__) {
      (exports = __webpack_require__(539)(!1)).push([module.i, "", ""]),
        (module.exports = exports);
    },
    1040: function (module, __webpack_exports__, __webpack_require__) {
      "use strict";
      __webpack_require__.r(__webpack_exports__),
        (__webpack_exports__.default = {
          component: Link,
          title: "Atoms/Link",
        });
    },
    1047: function (module, __webpack_exports__, __webpack_require__) {
      "use strict";
      __webpack_require__.r(__webpack_exports__);
      var preview_namespaceObject = {};
      __webpack_require__.r(preview_namespaceObject),
        __webpack_require__.d(
          preview_namespaceObject,
          "decorators",
          function () {
            return decorators;
          }
        ),
        __webpack_require__.d(
          preview_namespaceObject,
          "parameters",
          function () {
            return parameters;
          }
        );
      __webpack_require__(23),
        __webpack_require__(5),
        __webpack_require__(55),
        __webpack_require__(483),
        __webpack_require__(1026),
        __webpack_require__(53),
        __webpack_require__(1027),
        __webpack_require__(1028),
        __webpack_require__(482);
      var _templateObject,
        _templateObject2,
        client_api = __webpack_require__(68),
        esm = __webpack_require__(3),
        styled_components_browser_esm =
          (__webpack_require__(0),
          __webpack_require__(13),
          __webpack_require__(124)),
        dist = __webpack_require__(566);
      function _taggedTemplateLiteralLoose(strings, raw) {
        return raw || (raw = strings.slice(0)), (strings.raw = raw), strings;
      }
      var bodyStyles = Object(styled_components_browser_esm.css)(
          _templateObject ||
            (_templateObject = _taggedTemplateLiteralLoose([
              "\n  \n  font-family: 'NunitoSans' 'Cafe24SsurroundAir' !important;\n",
            ]))
        ),
        GlobalStyle = Object(styled_components_browser_esm.createGlobalStyle)(
          _templateObject2 ||
            (_templateObject2 = _taggedTemplateLiteralLoose([
              "\n ",
              "\n  @font-face{\n    font-family: 'Cafe24SsurroundAir';\n    font-style: normal;\n    font-weight: 400;\n    src: url('../../static/fonts/Cafe24SsurroundAir.ttf');\n  }\n\n  @font-face{\n    font-family: 'NunitoSans';\n    font-style: normal;\n    font-weight: 400;\n    src: url('../../static/fonts/NunitoSans-Light.ttf');\n  }\n\n  body {\n   ",
              "\n  }\n  \n",
            ])),
          dist.normalize,
          bodyStyles
        ),
        jsx_runtime = __webpack_require__(8),
        decorators = [
          function (Story) {
            return Object(jsx_runtime.jsxs)(jsx_runtime.Fragment, {
              children: [
                Object(jsx_runtime.jsx)(GlobalStyle, {}),
                Object(jsx_runtime.jsx)(Story, {}),
              ],
            });
          },
        ],
        parameters = {
          actions: { argTypesRegex: "^on[A-Z].*" },
          controls: {
            matchers: { color: /(background|color)$/i, date: /Date$/ },
          },
        };
      function ownKeys(object, enumerableOnly) {
        var keys = Object.keys(object);
        if (Object.getOwnPropertySymbols) {
          var symbols = Object.getOwnPropertySymbols(object);
          enumerableOnly &&
            (symbols = symbols.filter(function (sym) {
              return Object.getOwnPropertyDescriptor(object, sym).enumerable;
            })),
            keys.push.apply(keys, symbols);
        }
        return keys;
      }
      function _defineProperty(obj, key, value) {
        return (
          key in obj
            ? Object.defineProperty(obj, key, {
                value: value,
                enumerable: !0,
                configurable: !0,
                writable: !0,
              })
            : (obj[key] = value),
          obj
        );
      }
      Object.keys(preview_namespaceObject).forEach(function (key) {
        var value = preview_namespaceObject[key];
        switch (key) {
          case "args":
          case "argTypes":
            return esm.a.warn(
              "Invalid args/argTypes in config, ignoring.",
              JSON.stringify(value)
            );
          case "decorators":
            return value.forEach(function (decorator) {
              return Object(client_api.c)(decorator, !1);
            });
          case "loaders":
            return value.forEach(function (loader) {
              return Object(client_api.d)(loader, !1);
            });
          case "parameters":
            return Object(client_api.e)(
              (function _objectSpread(target) {
                for (var i = 1; i < arguments.length; i++) {
                  var source = null != arguments[i] ? arguments[i] : {};
                  i % 2
                    ? ownKeys(Object(source), !0).forEach(function (key) {
                        _defineProperty(target, key, source[key]);
                      })
                    : Object.getOwnPropertyDescriptors
                    ? Object.defineProperties(
                        target,
                        Object.getOwnPropertyDescriptors(source)
                      )
                    : ownKeys(Object(source)).forEach(function (key) {
                        Object.defineProperty(
                          target,
                          key,
                          Object.getOwnPropertyDescriptor(source, key)
                        );
                      });
                }
                return target;
              })({}, value),
              !1
            );
          case "argTypesEnhancers":
            return value.forEach(function (enhancer) {
              return Object(client_api.a)(enhancer);
            });
          case "argsEnhancers":
            return value.forEach(function (enhancer) {
              return Object(client_api.b)(enhancer);
            });
          case "render":
            return Object(client_api.g)(value);
          case "globals":
          case "globalTypes":
            var v = {};
            return (v[key] = value), Object(client_api.e)(v, !1);
          default:
            return console.log(key + " was not supported :( !");
        }
      });
    },
    1051: function (module, __webpack_exports__, __webpack_require__) {
      "use strict";
      __webpack_require__.r(__webpack_exports__),
        __webpack_require__.d(__webpack_exports__, "Default", function () {
          return Button_stories_Default;
        }),
        __webpack_require__.d(__webpack_exports__, "Danger", function () {
          return Button_stories_Danger;
        }),
        __webpack_require__.d(__webpack_exports__, "Ghost", function () {
          return Button_stories_Ghost;
        }),
        __webpack_require__.d(__webpack_exports__, "Outline", function () {
          return Button_stories_Outline;
        }),
        __webpack_require__.d(__webpack_exports__, "Icon", function () {
          return Button_stories_Icon;
        }),
        __webpack_require__.d(__webpack_exports__, "Destructive", function () {
          return Button_stories_Destructive;
        });
      __webpack_require__(13),
        __webpack_require__(1033),
        __webpack_require__(5),
        __webpack_require__(11),
        __webpack_require__(7),
        __webpack_require__(20),
        __webpack_require__(16),
        __webpack_require__(14),
        __webpack_require__(15),
        __webpack_require__(6),
        __webpack_require__(29),
        __webpack_require__(18);
      var react = __webpack_require__(0),
        jsx_runtime =
          (__webpack_require__(23),
          __webpack_require__(537),
          __webpack_require__(56),
          __webpack_require__(1034),
          __webpack_require__(8)),
        _excluded = ["backgroundColor", "label", "borderRadius", "className"];
      function _objectWithoutProperties(source, excluded) {
        if (null == source) return {};
        var key,
          i,
          target = (function _objectWithoutPropertiesLoose(source, excluded) {
            if (null == source) return {};
            var key,
              i,
              target = {},
              sourceKeys = Object.keys(source);
            for (i = 0; i < sourceKeys.length; i++)
              (key = sourceKeys[i]),
                excluded.indexOf(key) >= 0 || (target[key] = source[key]);
            return target;
          })(source, excluded);
        if (Object.getOwnPropertySymbols) {
          var sourceSymbolKeys = Object.getOwnPropertySymbols(source);
          for (i = 0; i < sourceSymbolKeys.length; i++)
            (key = sourceSymbolKeys[i]),
              excluded.indexOf(key) >= 0 ||
                (Object.prototype.propertyIsEnumerable.call(source, key) &&
                  (target[key] = source[key]));
        }
        return target;
      }
      var Button_Button = function Button(_ref) {
        var backgroundColor = _ref.backgroundColor,
          label = _ref.label,
          borderRadius = _ref.borderRadius,
          _ref$className = _ref.className,
          className = void 0 === _ref$className ? [] : _ref$className,
          props = _objectWithoutProperties(_ref, _excluded);
        return Object(jsx_runtime.jsx)(
          "button",
          Object.assign(
            {
              type: "button",
              style: {
                backgroundColor: backgroundColor,
                borderRadius: borderRadius,
              },
              className: "button_default " + className.join(" "),
            },
            props,
            { children: label }
          )
        );
      };
      Button_Button.displayName = "Button";
      try {
        (Button_Button.displayName = "Button"),
          (Button_Button.__docgenInfo = {
            description: "Primary UI component for user interaction",
            displayName: "Button",
            props: {
              backgroundColor: {
                defaultValue: null,
                description: "버튼 배경 색깔",
                name: "backgroundColor",
                required: !1,
                type: { name: "string" },
              },
              borderRadius: {
                defaultValue: null,
                description: "버튼 테두리 라운드 설정",
                name: "borderRadius",
                required: !1,
                type: { name: "string" },
              },
              className: {
                defaultValue: { value: "[]" },
                description: "React className 설정",
                name: "className",
                required: !1,
                type: { name: "string[]" },
              },
              label: {
                defaultValue: null,
                description: "버튼 내부 내용 설정",
                name: "label",
                required: !0,
                type: { name: "string" },
              },
              onClick: {
                defaultValue: null,
                description: "클릭 핸들러",
                name: "onClick",
                required: !1,
                type: { name: "() => void" },
              },
            },
          }),
          "undefined" != typeof STORYBOOK_REACT_CLASSES &&
            (STORYBOOK_REACT_CLASSES["stories/atoms/button/Button.tsx#Button"] =
              {
                docgenInfo: Button_Button.__docgenInfo,
                name: "Button",
                path: "stories/atoms/button/Button.tsx#Button",
              });
      } catch (__react_docgen_typescript_loader_error) {}
      var _templateObject,
        styled_components_browser_esm = __webpack_require__(124);
      function _slicedToArray(arr, i) {
        return (
          (function _arrayWithHoles(arr) {
            if (Array.isArray(arr)) return arr;
          })(arr) ||
          (function _iterableToArrayLimit(arr, i) {
            var _i =
              null == arr
                ? null
                : ("undefined" != typeof Symbol && arr[Symbol.iterator]) ||
                  arr["@@iterator"];
            if (null == _i) return;
            var _s,
              _e,
              _arr = [],
              _n = !0,
              _d = !1;
            try {
              for (
                _i = _i.call(arr);
                !(_n = (_s = _i.next()).done) &&
                (_arr.push(_s.value), !i || _arr.length !== i);
                _n = !0
              );
            } catch (err) {
              (_d = !0), (_e = err);
            } finally {
              try {
                _n || null == _i.return || _i.return();
              } finally {
                if (_d) throw _e;
              }
            }
            return _arr;
          })(arr, i) ||
          (function _unsupportedIterableToArray(o, minLen) {
            if (!o) return;
            if ("string" == typeof o) return _arrayLikeToArray(o, minLen);
            var n = Object.prototype.toString.call(o).slice(8, -1);
            "Object" === n && o.constructor && (n = o.constructor.name);
            if ("Map" === n || "Set" === n) return Array.from(o);
            if (
              "Arguments" === n ||
              /^(?:Ui|I)nt(?:8|16|32)(?:Clamped)?Array$/.test(n)
            )
              return _arrayLikeToArray(o, minLen);
          })(arr, i) ||
          (function _nonIterableRest() {
            throw new TypeError(
              "Invalid attempt to destructure non-iterable instance.\nIn order to be iterable, non-array objects must have a [Symbol.iterator]() method."
            );
          })()
        );
      }
      function _arrayLikeToArray(arr, len) {
        (null == len || len > arr.length) && (len = arr.length);
        for (var i = 0, arr2 = new Array(len); i < len; i++) arr2[i] = arr[i];
        return arr2;
      }
      __webpack_exports__.default = {
        component: Button_Button,
        title: "Atoms/Button",
      };
      var ComponentBox = styled_components_browser_esm.default.div(
          _templateObject ||
            (_templateObject = (function _taggedTemplateLiteralLoose(
              strings,
              raw
            ) {
              return (
                raw || (raw = strings.slice(0)), (strings.raw = raw), strings
              );
            })(["\n    display: flex;\n    justify-content: space-around;\n"]))
        ),
        Button_stories_Default = function Default() {
          var _useState2 = _slicedToArray(Object(react.useState)("0%"), 2),
            borderRadius = _useState2[0];
          _useState2[1];
          return Object(jsx_runtime.jsxs)(jsx_runtime.Fragment, {
            children: [
              Object(jsx_runtime.jsxs)(jsx_runtime.Fragment, {
                children: [
                  Object(jsx_runtime.jsx)("h5", { children: "Solid button" }),
                  Object(jsx_runtime.jsxs)(ComponentBox, {
                    children: [
                      Object(jsx_runtime.jsx)(Button_Button, {
                        borderRadius: borderRadius,
                        label: "Solid Button",
                      }),
                      Object(jsx_runtime.jsx)(Button_Button, {
                        borderRadius: borderRadius,
                        className: ["button_hover"],
                        label: "Solid Button",
                      }),
                    ],
                  }),
                ],
              }),
              Object(jsx_runtime.jsxs)(jsx_runtime.Fragment, {
                children: [
                  Object(jsx_runtime.jsx)("h5", { children: "Ghost button" }),
                  Object(jsx_runtime.jsxs)(ComponentBox, {
                    children: [
                      Object(jsx_runtime.jsx)(Button_Button, {
                        borderRadius: borderRadius,
                        className: ["button_Ghost"],
                        label: "Ghost Button",
                      }),
                      Object(jsx_runtime.jsx)(Button_Button, {
                        borderRadius: borderRadius,
                        className: ["button_hover"],
                        label: "Ghost Button",
                      }),
                    ],
                  }),
                ],
              }),
              Object(jsx_runtime.jsxs)(jsx_runtime.Fragment, {
                children: [
                  Object(jsx_runtime.jsx)("h5", { children: "Outline button" }),
                  Object(jsx_runtime.jsxs)(ComponentBox, {
                    children: [
                      Object(jsx_runtime.jsx)(Button_Button, {
                        borderRadius: borderRadius,
                        className: ["button_Outline"],
                        label: "Outline Button",
                      }),
                      Object(jsx_runtime.jsx)(Button_Button, {
                        borderRadius: borderRadius,
                        className: ["button_hover"],
                        label: "Outline Button",
                      }),
                    ],
                  }),
                ],
              }),
              Object(jsx_runtime.jsxs)(jsx_runtime.Fragment, {
                children: [
                  Object(jsx_runtime.jsx)("h5", {
                    children: "Light Solid button",
                  }),
                  Object(jsx_runtime.jsx)(Button_Button, {
                    borderRadius: borderRadius,
                    label: "Button",
                  }),
                ],
              }),
              Object(jsx_runtime.jsxs)(jsx_runtime.Fragment, {
                children: [
                  Object(jsx_runtime.jsx)("h5", { children: "Text button" }),
                  Object(jsx_runtime.jsxs)(ComponentBox, {
                    children: [
                      Object(jsx_runtime.jsx)(Button_Button, {
                        borderRadius: borderRadius,
                        className: ["button_Text"],
                        label: "Text Button",
                      }),
                      Object(jsx_runtime.jsx)(Button_Button, {
                        borderRadius: borderRadius,
                        className: ["button_hover"],
                        label: "Text Button",
                      }),
                    ],
                  }),
                ],
              }),
              Object(jsx_runtime.jsxs)(jsx_runtime.Fragment, {
                children: [
                  Object(jsx_runtime.jsx)("h5", { children: "Icon button" }),
                  Object(jsx_runtime.jsx)(Button_Button, {
                    borderRadius: borderRadius,
                    label: "Button",
                  }),
                ],
              }),
              Object(jsx_runtime.jsxs)(jsx_runtime.Fragment, {
                children: [
                  Object(jsx_runtime.jsx)("h5", {
                    children: "Destructive button",
                  }),
                  Object(jsx_runtime.jsxs)(ComponentBox, {
                    children: [
                      Object(jsx_runtime.jsx)(Button_Button, {
                        borderRadius: borderRadius,
                        className: ["button_Destructive"],
                        label: "Destructive Button",
                      }),
                      Object(jsx_runtime.jsx)(Button_Button, {
                        borderRadius: borderRadius,
                        className: ["button_hover"],
                        label: "Destructive Button",
                      }),
                    ],
                  }),
                ],
              }),
            ],
          });
        },
        Button_stories_Danger = function Danger() {
          return Object(jsx_runtime.jsx)(Button_Button, { label: "Button" });
        };
      (Button_stories_Danger.displayName = "Danger"),
        (Button_stories_Default.storyName = "");
      var Button_stories_Ghost = function Ghost() {
        return Object(jsx_runtime.jsx)(Button_Button, { label: "Button" });
      };
      Button_stories_Ghost.displayName = "Ghost";
      var Button_stories_Outline = function Outline() {
        return Object(jsx_runtime.jsx)(Button_Button, { label: "Button" });
      };
      Button_stories_Outline.displayName = "Outline";
      var Button_stories_Icon = function Icon() {
        return Object(jsx_runtime.jsx)(Button_Button, { label: "Button" });
      };
      Button_stories_Icon.displayName = "Icon";
      var Button_stories_Destructive = function Destructive() {
        return Object(jsx_runtime.jsx)(Button_Button, { label: "Button" });
      };
      (Button_stories_Destructive.displayName = "Destructive"),
        (Button_stories_Default.parameters = Object.assign(
          {
            storySource: {
              source:
                '() => {\r\n  \r\n    const [borderRadius, setBorderRadius] = useState(\'0%\');\r\n\r\n\r\n    return (<>\r\n        <>\r\n            <h5>Solid button</h5>\r\n            <ComponentBox>\r\n                <Button borderRadius={borderRadius}\r\n                    label="Solid Button" />\r\n                <Button borderRadius={borderRadius}\r\n                    className={["button_hover"]}\r\n                    label="Solid Button" />\r\n            </ComponentBox>\r\n        </>\r\n        <>\r\n            <h5>Ghost button</h5>\r\n            <ComponentBox>\r\n              <Button borderRadius={borderRadius}\r\n                    className={["button_Ghost"]}\r\n                    label="Ghost Button" />\r\n              <Button borderRadius={borderRadius}\r\n                    className={["button_hover"]}\r\n                    label="Ghost Button" />\r\n          </ComponentBox>\r\n        </>\r\n        <>\r\n            <h5>Outline button</h5>\r\n            <ComponentBox>\r\n              <Button borderRadius={borderRadius}\r\n                    className={["button_Outline"]}\r\n                    label="Outline Button" />\r\n              <Button borderRadius={borderRadius}\r\n                    className={["button_hover"]}\r\n                    label="Outline Button" />\r\n            </ComponentBox>\r\n        </>\r\n        <>\r\n            <h5>Light Solid button</h5>\r\n            <Button borderRadius={borderRadius} label="Button" />\r\n        </>\r\n        <>\r\n            <h5>Text button</h5>\r\n            <ComponentBox>\r\n              <Button borderRadius={borderRadius}\r\n                    className={["button_Text"]}\r\n                    label="Text Button" />\r\n              <Button borderRadius={borderRadius}\r\n                    className={["button_hover"]}\r\n                    label="Text Button" />\r\n            </ComponentBox>\r\n        </>\r\n        <>\r\n            <h5>Icon button</h5>\r\n            <Button borderRadius={borderRadius} label="Button" />\r\n        </>\r\n        <>\r\n            <h5>Destructive button</h5>\r\n            <ComponentBox>\r\n              <Button borderRadius={borderRadius}\r\n                    className={["button_Destructive"]}\r\n                    label="Destructive Button" />\r\n              <Button borderRadius={borderRadius}\r\n                    className={["button_hover"]}\r\n                    label="Destructive Button" />\r\n            </ComponentBox>\r\n        </>\r\n        \r\n    </>);\r\n}',
            },
          },
          Button_stories_Default.parameters
        )),
        (Button_stories_Danger.parameters = Object.assign(
          { storySource: { source: '() => <Button label="Button" />' } },
          Button_stories_Danger.parameters
        )),
        (Button_stories_Ghost.parameters = Object.assign(
          { storySource: { source: '() => <Button label="Button" />' } },
          Button_stories_Ghost.parameters
        )),
        (Button_stories_Outline.parameters = Object.assign(
          { storySource: { source: '() => <Button label="Button" />' } },
          Button_stories_Outline.parameters
        )),
        (Button_stories_Icon.parameters = Object.assign(
          { storySource: { source: '() => <Button label="Button" />' } },
          Button_stories_Icon.parameters
        )),
        (Button_stories_Destructive.parameters = Object.assign(
          { storySource: { source: '() => <Button label="Button" />' } },
          Button_stories_Destructive.parameters
        ));
      try {
        (Button_stories_Default.displayName = "Default"),
          (Button_stories_Default.__docgenInfo = {
            description: "",
            displayName: "Default",
            props: {},
          }),
          "undefined" != typeof STORYBOOK_REACT_CLASSES &&
            (STORYBOOK_REACT_CLASSES[
              "stories/atoms/button/Button.stories.tsx#Default"
            ] = {
              docgenInfo: Button_stories_Default.__docgenInfo,
              name: "Default",
              path: "stories/atoms/button/Button.stories.tsx#Default",
            });
      } catch (__react_docgen_typescript_loader_error) {}
      try {
        (Button_stories_Danger.displayName = "Danger"),
          (Button_stories_Danger.__docgenInfo = {
            description: "",
            displayName: "Danger",
            props: {},
          }),
          "undefined" != typeof STORYBOOK_REACT_CLASSES &&
            (STORYBOOK_REACT_CLASSES[
              "stories/atoms/button/Button.stories.tsx#Danger"
            ] = {
              docgenInfo: Button_stories_Danger.__docgenInfo,
              name: "Danger",
              path: "stories/atoms/button/Button.stories.tsx#Danger",
            });
      } catch (__react_docgen_typescript_loader_error) {}
      try {
        (Button_stories_Ghost.displayName = "Ghost"),
          (Button_stories_Ghost.__docgenInfo = {
            description: "",
            displayName: "Ghost",
            props: {},
          }),
          "undefined" != typeof STORYBOOK_REACT_CLASSES &&
            (STORYBOOK_REACT_CLASSES[
              "stories/atoms/button/Button.stories.tsx#Ghost"
            ] = {
              docgenInfo: Button_stories_Ghost.__docgenInfo,
              name: "Ghost",
              path: "stories/atoms/button/Button.stories.tsx#Ghost",
            });
      } catch (__react_docgen_typescript_loader_error) {}
      try {
        (Button_stories_Outline.displayName = "Outline"),
          (Button_stories_Outline.__docgenInfo = {
            description: "",
            displayName: "Outline",
            props: {},
          }),
          "undefined" != typeof STORYBOOK_REACT_CLASSES &&
            (STORYBOOK_REACT_CLASSES[
              "stories/atoms/button/Button.stories.tsx#Outline"
            ] = {
              docgenInfo: Button_stories_Outline.__docgenInfo,
              name: "Outline",
              path: "stories/atoms/button/Button.stories.tsx#Outline",
            });
      } catch (__react_docgen_typescript_loader_error) {}
      try {
        (Button_stories_Icon.displayName = "Icon"),
          (Button_stories_Icon.__docgenInfo = {
            description: "",
            displayName: "Icon",
            props: {},
          }),
          "undefined" != typeof STORYBOOK_REACT_CLASSES &&
            (STORYBOOK_REACT_CLASSES[
              "stories/atoms/button/Button.stories.tsx#Icon"
            ] = {
              docgenInfo: Button_stories_Icon.__docgenInfo,
              name: "Icon",
              path: "stories/atoms/button/Button.stories.tsx#Icon",
            });
      } catch (__react_docgen_typescript_loader_error) {}
      try {
        (Button_stories_Destructive.displayName = "Destructive"),
          (Button_stories_Destructive.__docgenInfo = {
            description: "",
            displayName: "Destructive",
            props: {},
          }),
          "undefined" != typeof STORYBOOK_REACT_CLASSES &&
            (STORYBOOK_REACT_CLASSES[
              "stories/atoms/button/Button.stories.tsx#Destructive"
            ] = {
              docgenInfo: Button_stories_Destructive.__docgenInfo,
              name: "Destructive",
              path: "stories/atoms/button/Button.stories.tsx#Destructive",
            });
      } catch (__react_docgen_typescript_loader_error) {}
    },
    1052: function (module, __webpack_exports__, __webpack_require__) {
      "use strict";
      __webpack_require__.r(__webpack_exports__),
        __webpack_require__.d(__webpack_exports__, "Default", function () {
          return Label_stories_Default;
        });
      __webpack_require__(13),
        __webpack_require__(18),
        __webpack_require__(0),
        __webpack_require__(23),
        __webpack_require__(537),
        __webpack_require__(5),
        __webpack_require__(1038);
      var jsx_runtime = __webpack_require__(8),
        _excluded = ["text", "style"];
      function _objectWithoutProperties(source, excluded) {
        if (null == source) return {};
        var key,
          i,
          target = (function _objectWithoutPropertiesLoose(source, excluded) {
            if (null == source) return {};
            var key,
              i,
              target = {},
              sourceKeys = Object.keys(source);
            for (i = 0; i < sourceKeys.length; i++)
              (key = sourceKeys[i]),
                excluded.indexOf(key) >= 0 || (target[key] = source[key]);
            return target;
          })(source, excluded);
        if (Object.getOwnPropertySymbols) {
          var sourceSymbolKeys = Object.getOwnPropertySymbols(source);
          for (i = 0; i < sourceSymbolKeys.length; i++)
            (key = sourceSymbolKeys[i]),
              excluded.indexOf(key) >= 0 ||
                (Object.prototype.propertyIsEnumerable.call(source, key) &&
                  (target[key] = source[key]));
        }
        return target;
      }
      var Label_Label = function Label(_ref) {
        var text = _ref.text,
          style = _ref.style;
        _objectWithoutProperties(_ref, _excluded);
        return Object(jsx_runtime.jsx)("div", { style: style, children: text });
      };
      Label_Label.displayName = "Label";
      try {
        (Label_Label.displayName = "Label"),
          (Label_Label.__docgenInfo = {
            description: "",
            displayName: "Label",
            props: {
              text: {
                defaultValue: null,
                description: "",
                name: "text",
                required: !0,
                type: { name: "any" },
              },
              style: {
                defaultValue: null,
                description: "",
                name: "style",
                required: !0,
                type: { name: "any" },
              },
            },
          }),
          "undefined" != typeof STORYBOOK_REACT_CLASSES &&
            (STORYBOOK_REACT_CLASSES["stories/atoms/label/Label.tsx#Label"] = {
              docgenInfo: Label_Label.__docgenInfo,
              name: "Label",
              path: "stories/atoms/label/Label.tsx#Label",
            });
      } catch (__react_docgen_typescript_loader_error) {}
      var _templateObject,
        styled_components_browser_esm = __webpack_require__(124);
      __webpack_exports__.default = {
        component: Label_Label,
        title: "Atoms/Label",
      };
      var ComponentBox = styled_components_browser_esm.default.div(
          _templateObject ||
            (_templateObject = (function _taggedTemplateLiteralLoose(
              strings,
              raw
            ) {
              return (
                raw || (raw = strings.slice(0)), (strings.raw = raw), strings
              );
            })(["\n    display: flex;\n    justify-content: space-around;\n"]))
        ),
        Label_stories_Default = function Default() {
          return Object(jsx_runtime.jsx)(jsx_runtime.Fragment, {
            children: Object(jsx_runtime.jsxs)(jsx_runtime.Fragment, {
              children: [
                Object(jsx_runtime.jsx)("h5", { children: "Solid label" }),
                Object(jsx_runtime.jsxs)(ComponentBox, {
                  children: [
                    Object(jsx_runtime.jsx)(Label_Label, {
                      label: "Solid Label",
                    }),
                    Object(jsx_runtime.jsx)(Label_Label, {
                      label: "Solid Label",
                    }),
                  ],
                }),
              ],
            }),
          });
        };
      Label_stories_Default.parameters = Object.assign(
        {
          storySource: {
            source:
              '() => {\r\n  \r\n    return (<>\r\n        <>\r\n            <h5>Solid label</h5>\r\n            <ComponentBox>\r\n\r\n                <Label\r\n                    label="Solid Label" />\r\n                <Label \r\n                    label="Solid Label" />\r\n                \r\n            </ComponentBox>\r\n        </>\r\n    </>);\r\n}',
          },
        },
        Label_stories_Default.parameters
      );
      try {
        (Label_stories_Default.displayName = "Default"),
          (Label_stories_Default.__docgenInfo = {
            description: "",
            displayName: "Default",
            props: {},
          }),
          "undefined" != typeof STORYBOOK_REACT_CLASSES &&
            (STORYBOOK_REACT_CLASSES[
              "stories/atoms/label/Label.stories.tsx#Default"
            ] = {
              docgenInfo: Label_stories_Default.__docgenInfo,
              name: "Default",
              path: "stories/atoms/label/Label.stories.tsx#Default",
            });
      } catch (__react_docgen_typescript_loader_error) {}
    },
    587: function (module, exports, __webpack_require__) {
      __webpack_require__(588),
        __webpack_require__(743),
        __webpack_require__(744),
        __webpack_require__(1041),
        __webpack_require__(1042),
        __webpack_require__(1048),
        __webpack_require__(1049),
        __webpack_require__(1046),
        __webpack_require__(1043),
        __webpack_require__(1050),
        __webpack_require__(1044),
        __webpack_require__(1045),
        __webpack_require__(942),
        __webpack_require__(1025),
        __webpack_require__(1047),
        (module.exports = __webpack_require__(1030));
    },
    654: function (module, exports) {},
    744: function (module, __webpack_exports__, __webpack_require__) {
      "use strict";
      __webpack_require__.r(__webpack_exports__);
      __webpack_require__(402);
    },
    946: function (module, exports) {},
    948: function (module, exports) {},
    958: function (module, exports) {},
    960: function (module, exports) {},
    985: function (module, exports) {},
    986: function (module, exports) {},
    991: function (module, exports) {},
  },
  [[587, 2, 3]],
]);
