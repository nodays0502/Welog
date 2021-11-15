(self.webpackChunk_N_E = self.webpackChunk_N_E || []).push([
  [378],
  {
    2236: function (e, t, n) {
      "use strict";
      var r = n(8883),
        a = n(6090);
      t.default = function (e) {
        var t = e.src,
          n = e.sizes,
          a = e.unoptimized,
          c = void 0 !== a && a,
          u = e.priority,
          d = void 0 !== u && u,
          v = e.loading,
          g = e.lazyBoundary,
          p = void 0 === g ? "200px" : g,
          y = e.className,
          b = e.quality,
          x = e.width,
          w = e.height,
          k = e.objectFit,
          O = e.objectPosition,
          z = e.onLoadingComplete,
          S = e.loader,
          A = void 0 === S ? _ : S,
          C = e.placeholder,
          P = void 0 === C ? "empty" : C,
          E = e.blurDataURL,
          I = (function (e, t) {
            if (null == e) return {};
            var n,
              r,
              a = (function (e, t) {
                if (null == e) return {};
                var n,
                  r,
                  a = {},
                  i = Object.keys(e);
                for (r = 0; r < i.length; r++)
                  (n = i[r]), t.indexOf(n) >= 0 || (a[n] = e[n]);
                return a;
              })(e, t);
            if (Object.getOwnPropertySymbols) {
              var i = Object.getOwnPropertySymbols(e);
              for (r = 0; r < i.length; r++)
                (n = i[r]),
                  t.indexOf(n) >= 0 ||
                    (Object.prototype.propertyIsEnumerable.call(e, n) &&
                      (a[n] = e[n]));
            }
            return a;
          })(e, [
            "src",
            "sizes",
            "unoptimized",
            "priority",
            "loading",
            "lazyBoundary",
            "className",
            "quality",
            "width",
            "height",
            "objectFit",
            "objectPosition",
            "onLoadingComplete",
            "loader",
            "placeholder",
            "blurDataURL",
          ]),
          R = n ? "responsive" : "intrinsic";
        "layout" in I && (I.layout && (R = I.layout), delete I.layout);
        var B = "";
        if (
          (function (e) {
            return (
              "object" === typeof e &&
              (h(e) ||
                (function (e) {
                  return void 0 !== e.src;
                })(e))
            );
          })(t)
        ) {
          var L = h(t) ? t.default : t;
          if (!L.src)
            throw new Error(
              "An object should only be passed to the image component src parameter if it comes from a static image import. It must include src. Received ".concat(
                JSON.stringify(L)
              )
            );
          if (
            ((E = E || L.blurDataURL),
            (B = L.src),
            (!R || "fill" !== R) &&
              ((w = w || L.height), (x = x || L.width), !L.height || !L.width))
          )
            throw new Error(
              "An object should only be passed to the image component src parameter if it comes from a static image import. It must include height and width. Received ".concat(
                JSON.stringify(L)
              )
            );
        }
        t = "string" === typeof t ? t : B;
        var D = N(x),
          q = N(w),
          M = N(b),
          W = !d && ("lazy" === v || "undefined" === typeof v);
        (t.startsWith("data:") || t.startsWith("blob:")) &&
          ((c = !0), (W = !1));
        m.has(t) && (W = !1);
        0;
        var H,
          T,
          U,
          F = l.useIntersection({ rootMargin: p, disabled: !W }),
          V = r(F, 2),
          G = V[0],
          J = V[1],
          X = !W || J,
          Q = {
            position: "absolute",
            top: 0,
            left: 0,
            bottom: 0,
            right: 0,
            boxSizing: "border-box",
            padding: 0,
            border: "none",
            margin: "auto",
            display: "block",
            width: 0,
            height: 0,
            minWidth: "100%",
            maxWidth: "100%",
            minHeight: "100%",
            maxHeight: "100%",
            objectFit: k,
            objectPosition: O,
          },
          K =
            "blur" === P
              ? {
                  filter: "blur(20px)",
                  backgroundSize: k || "cover",
                  backgroundImage: 'url("'.concat(E, '")'),
                  backgroundPosition: O || "0% 0%",
                }
              : {};
        if ("fill" === R)
          H = {
            display: "block",
            overflow: "hidden",
            position: "absolute",
            top: 0,
            left: 0,
            bottom: 0,
            right: 0,
            boxSizing: "border-box",
            margin: 0,
          };
        else if ("undefined" !== typeof D && "undefined" !== typeof q) {
          var Y = q / D,
            Z = isNaN(Y) ? "100%" : "".concat(100 * Y, "%");
          "responsive" === R
            ? ((H = {
                display: "block",
                overflow: "hidden",
                position: "relative",
                boxSizing: "border-box",
                margin: 0,
              }),
              (T = {
                display: "block",
                boxSizing: "border-box",
                paddingTop: Z,
              }))
            : "intrinsic" === R
            ? ((H = {
                display: "inline-block",
                maxWidth: "100%",
                overflow: "hidden",
                position: "relative",
                boxSizing: "border-box",
                margin: 0,
              }),
              (T = {
                boxSizing: "border-box",
                display: "block",
                maxWidth: "100%",
              }),
              (U = '<svg width="'
                .concat(D, '" height="')
                .concat(
                  q,
                  '" xmlns="http://www.w3.org/2000/svg" version="1.1"/>'
                )))
            : "fixed" === R &&
              (H = {
                overflow: "hidden",
                boxSizing: "border-box",
                display: "inline-block",
                position: "relative",
                width: D,
                height: q,
              });
        } else 0;
        var $ = {
          src: "data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///yH5BAEAAAAALAAAAAABAAEAAAIBRAA7",
          srcSet: void 0,
          sizes: void 0,
        };
        X &&
          ($ = j({
            src: t,
            unoptimized: c,
            layout: R,
            width: D,
            quality: M,
            sizes: n,
            loader: A,
          }));
        var ee = t;
        return i.default.createElement(
          "div",
          { style: H },
          T
            ? i.default.createElement(
                "div",
                { style: T },
                U
                  ? i.default.createElement("img", {
                      style: {
                        maxWidth: "100%",
                        display: "block",
                        margin: 0,
                        border: "none",
                        padding: 0,
                      },
                      alt: "",
                      "aria-hidden": !0,
                      src: "data:image/svg+xml;base64,".concat(s.toBase64(U)),
                    })
                  : null
              )
            : null,
          i.default.createElement(
            "img",
            Object.assign({}, I, $, {
              decoding: "async",
              "data-nimg": R,
              className: y,
              ref: function (e) {
                G(e),
                  (function (e, t, n, r, a) {
                    if (!e) return;
                    var i = function () {
                      e.src.startsWith("data:") ||
                        ("decode" in e ? e.decode() : Promise.resolve())
                          .catch(function () {})
                          .then(function () {
                            if (
                              ("blur" === r &&
                                ((e.style.filter = "none"),
                                (e.style.backgroundSize = "none"),
                                (e.style.backgroundImage = "none")),
                              m.add(t),
                              a)
                            ) {
                              var n = e.naturalWidth,
                                i = e.naturalHeight;
                              a({ naturalWidth: n, naturalHeight: i });
                            }
                          });
                    };
                    e.complete ? i() : (e.onload = i);
                  })(e, ee, 0, P, z);
              },
              style: f({}, Q, K),
            })
          ),
          i.default.createElement(
            "noscript",
            null,
            i.default.createElement(
              "img",
              Object.assign(
                {},
                I,
                j({
                  src: t,
                  unoptimized: c,
                  layout: R,
                  width: D,
                  quality: M,
                  sizes: n,
                  loader: A,
                }),
                {
                  decoding: "async",
                  "data-nimg": R,
                  style: Q,
                  className: y,
                  loading: v || "lazy",
                }
              )
            )
          ),
          d
            ? i.default.createElement(
                o.default,
                null,
                i.default.createElement("link", {
                  key: "__nimg-" + $.src + $.srcSet + $.sizes,
                  rel: "preload",
                  as: "image",
                  href: $.srcSet ? void 0 : $.src,
                  imagesrcset: $.srcSet,
                  imagesizes: $.sizes,
                })
              )
            : null
        );
      };
      var i = d(n(6687)),
        o = d(n(854)),
        s = n(2268),
        c = n(5026),
        l = n(1944);
      function u(e, t, n) {
        return (
          t in e
            ? Object.defineProperty(e, t, {
                value: n,
                enumerable: !0,
                configurable: !0,
                writable: !0,
              })
            : (e[t] = n),
          e
        );
      }
      function d(e) {
        return e && e.__esModule ? e : { default: e };
      }
      function f(e) {
        for (var t = 1; t < arguments.length; t++) {
          var n = null != arguments[t] ? arguments[t] : {},
            r = Object.keys(n);
          "function" === typeof Object.getOwnPropertySymbols &&
            (r = r.concat(
              Object.getOwnPropertySymbols(n).filter(function (e) {
                return Object.getOwnPropertyDescriptor(n, e).enumerable;
              })
            )),
            r.forEach(function (t) {
              u(e, t, n[t]);
            });
        }
        return e;
      }
      var m = new Set();
      var v = new Map([
        [
          "default",
          function (e) {
            var t = e.root,
              n = e.src,
              r = e.width,
              a = e.quality;
            0;
            return ""
              .concat(t, "?url=")
              .concat(encodeURIComponent(n), "&w=")
              .concat(r, "&q=")
              .concat(a || 75);
          },
        ],
        [
          "imgix",
          function (e) {
            var t = e.root,
              n = e.src,
              r = e.width,
              a = e.quality,
              i = new URL("".concat(t).concat(k(n))),
              o = i.searchParams;
            o.set("auto", o.get("auto") || "format"),
              o.set("fit", o.get("fit") || "max"),
              o.set("w", o.get("w") || r.toString()),
              a && o.set("q", a.toString());
            return i.href;
          },
        ],
        [
          "cloudinary",
          function (e) {
            var t = e.root,
              n = e.src,
              r = e.width,
              a = e.quality,
              i =
                ["f_auto", "c_limit", "w_" + r, "q_" + (a || "auto")].join(
                  ","
                ) + "/";
            return "".concat(t).concat(i).concat(k(n));
          },
        ],
        [
          "akamai",
          function (e) {
            var t = e.root,
              n = e.src,
              r = e.width;
            return "".concat(t).concat(k(n), "?imwidth=").concat(r);
          },
        ],
        [
          "custom",
          function (e) {
            var t = e.src;
            throw new Error(
              'Image with src "'.concat(t, '" is missing "loader" prop.') +
                "\nRead more: https://nextjs.org/docs/messages/next-image-missing-loader"
            );
          },
        ],
      ]);
      function h(e) {
        return void 0 !== e.default;
      }
      var g =
          {
            deviceSizes: [640, 750, 828, 1080, 1200, 1920, 2048, 3840],
            imageSizes: [16, 32, 48, 64, 96, 128, 256, 384],
            path: "/_next/image",
            loader: "default",
          } || c.imageConfigDefault,
        p = g.deviceSizes,
        y = g.imageSizes,
        b = g.loader,
        x = g.path,
        w = (g.domains, [].concat(a(p), a(y)));
      function j(e) {
        var t = e.src,
          n = e.unoptimized,
          r = e.layout,
          i = e.width,
          o = e.quality,
          s = e.sizes,
          c = e.loader;
        if (n) return { src: t, srcSet: void 0, sizes: void 0 };
        var l = (function (e, t, n) {
            if (n && ("fill" === t || "responsive" === t)) {
              for (var r, i = /(^|\s)(1?\d?\d)vw/g, o = []; (r = i.exec(n)); r)
                o.push(parseInt(r[2]));
              if (o.length) {
                var s = 0.01 * Math.min.apply(Math, o);
                return {
                  widths: w.filter(function (e) {
                    return e >= p[0] * s;
                  }),
                  kind: "w",
                };
              }
              return { widths: w, kind: "w" };
            }
            return "number" !== typeof e || "fill" === t || "responsive" === t
              ? { widths: p, kind: "w" }
              : {
                  widths: a(
                    new Set(
                      [e, 2 * e].map(function (e) {
                        return (
                          w.find(function (t) {
                            return t >= e;
                          }) || w[w.length - 1]
                        );
                      })
                    )
                  ),
                  kind: "x",
                };
          })(i, r, s),
          u = l.widths,
          d = l.kind,
          f = u.length - 1;
        return {
          sizes: s || "w" !== d ? s : "100vw",
          srcSet: u
            .map(function (e, n) {
              return ""
                .concat(c({ src: t, quality: o, width: e }), " ")
                .concat("w" === d ? e : n + 1)
                .concat(d);
            })
            .join(", "),
          src: c({ src: t, quality: o, width: u[f] }),
        };
      }
      function N(e) {
        return "number" === typeof e
          ? e
          : "string" === typeof e
          ? parseInt(e, 10)
          : void 0;
      }
      function _(e) {
        var t = v.get(b);
        if (t) return t(f({ root: x }, e));
        throw new Error(
          'Unknown "loader" found in "next.config.js". Expected: '
            .concat(c.VALID_LOADERS.join(", "), ". Received: ")
            .concat(b)
        );
      }
      function k(e) {
        return "/" === e[0] ? e.slice(1) : e;
      }
      p.sort(function (e, t) {
        return e - t;
      }),
        w.sort(function (e, t) {
          return e - t;
        });
    },
    1944: function (e, t, n) {
      "use strict";
      var r = n(8883);
      Object.defineProperty(t, "__esModule", { value: !0 }),
        (t.useIntersection = function (e) {
          var t = e.rootMargin,
            n = e.disabled || !o,
            c = a.useRef(),
            l = a.useState(!1),
            u = r(l, 2),
            d = u[0],
            f = u[1],
            m = a.useCallback(
              function (e) {
                c.current && (c.current(), (c.current = void 0)),
                  n ||
                    d ||
                    (e &&
                      e.tagName &&
                      (c.current = (function (e, t, n) {
                        var r = (function (e) {
                            var t = e.rootMargin || "",
                              n = s.get(t);
                            if (n) return n;
                            var r = new Map(),
                              a = new IntersectionObserver(function (e) {
                                e.forEach(function (e) {
                                  var t = r.get(e.target),
                                    n =
                                      e.isIntersecting ||
                                      e.intersectionRatio > 0;
                                  t && n && t(n);
                                });
                              }, e);
                            return (
                              s.set(
                                t,
                                (n = { id: t, observer: a, elements: r })
                              ),
                              n
                            );
                          })(n),
                          a = r.id,
                          i = r.observer,
                          o = r.elements;
                        return (
                          o.set(e, t),
                          i.observe(e),
                          function () {
                            o.delete(e),
                              i.unobserve(e),
                              0 === o.size && (i.disconnect(), s.delete(a));
                          }
                        );
                      })(
                        e,
                        function (e) {
                          return e && f(e);
                        },
                        { rootMargin: t }
                      )));
              },
              [n, t, d]
            );
          return (
            a.useEffect(
              function () {
                if (!o && !d) {
                  var e = i.requestIdleCallback(function () {
                    return f(!0);
                  });
                  return function () {
                    return i.cancelIdleCallback(e);
                  };
                }
              },
              [d]
            ),
            [m, d]
          );
        });
      var a = n(6687),
        i = n(5789),
        o = "undefined" !== typeof IntersectionObserver;
      var s = new Map();
    },
    2268: function (e, t) {
      "use strict";
      Object.defineProperty(t, "__esModule", { value: !0 }),
        (t.toBase64 = function (e) {
          return window.btoa(e);
        });
    },
    2563: function (e, t, n) {
      "use strict";
      n.r(t),
        n.d(t, {
          default: function () {
            return I;
          },
        });
      n(6687);
      var r = n(4212),
        a = n(2010),
        i = function (e) {
          var t = e.className,
            n = e.style,
            i = e.onClick,
            o = e.src,
            s = e.alt;
          return (0, a.jsx)("div", {
            style: n,
            className: "imageContent_default ".concat(t.join(" ")),
            onClick: i,
            "aria-hidden": "true",
            children: (0, a.jsx)(r.default, {
              className: "image",
              layout: "fill",
              src: o,
              alt: s,
            }),
          });
        };
      i.defaultProps = { className: [], style: {}, onClick: function () {} };
      var o = n(9084),
        s = function (e) {
          var t = e.label,
            n = e.className,
            r = e.style,
            i = e.onClick;
          return (0, a.jsx)("button", {
            type: "button",
            style: r,
            className: "button_default ".concat(n.join(" ")),
            onClick: i,
            children: t,
          });
        },
        c = function (e) {
          var t = e.className;
          return (0, a.jsx)("div", {
            className: t,
            children: (0, a.jsx)(o.EaR, { size: "30" }),
          });
        };
      s.defaultProps = {
        className: [],
        style: {},
        onClick: function () {},
        label: "this is button",
      };
      var l = s,
        u = function (e) {
          var t = e.style,
            n = e.className,
            r = e.buttons;
          return (0, a.jsx)("div", {
            style: t,
            className: "buttonGroup_default ".concat(n.join(" ")),
            children: r.map(function (e) {
              return (0, a.jsx)(l, { label: e }, e);
            }),
          });
        };
      u.defaultProps = { style: {}, className: [], buttons: [] };
      var d = u,
        f = [
          "\ub300\ubb38",
          "\ucd5c\uadfc \ubc14\ub01c",
          "\uc694\uc998 \ud654\uc81c",
          "\uae30\ubd80",
          "\uc0ac\uc6a9\uc790 \ubaa8\uc784",
          "\uad00\ub9ac \uc694\uccad",
          "\ub3c4\uc6c0\ub9d0",
          "\uc815\ucc45\uacfc \uc9c0\uce68",
          "\uc9c8\ubb38\ubc29",
        ],
        m = ["button_leftNav"],
        v = function (e) {
          var t = e.className,
            n = e.style,
            r = e.image,
            o = e.onClick;
          return (0, a.jsxs)("div", {
            style: n,
            className: "leftNav_default ".concat(t.join(" ")),
            onClick: o,
            "aria-hidden": "true",
            children: [
              (0, a.jsx)("div", {
                className: "leftNav_topBox",
                children: (0, a.jsx)(i, {
                  src: r,
                  alt: "\uc67c\ucabd \uc0c1\ub2e8 \uc774\ubbf8\uc9c0",
                  className: ["imageContent_default"],
                }),
              }),
              (0, a.jsx)("div", {
                className: "leftNav_bottomBox",
                children: (0, a.jsx)(d, { buttons: f, className: m }),
              }),
            ],
          });
        };
      v.defaultProps = { className: [], style: {}, onClick: function () {} };
      var h = v,
        g = function (e) {
          var t = e.text,
            n = e.style,
            r = e.className;
          return (0, a.jsx)("div", {
            style: n,
            className: "Label_default ".concat(r.join(" ")),
            children: t,
          });
        };
      g.defaultProps = { style: {}, className: [] };
      var p = g,
        y = function (e) {
          var t = e.style,
            n = e.className,
            r = e.text;
          return (0, a.jsx)("div", {
            style: t,
            className: "TextBox_default ".concat(n.join(" ")),
            children: (0, a.jsx)(p, { text: r }),
          });
        };
      y.defaultProps = { style: {}, className: [] };
      var b = y,
        x = function (e) {
          var t = e.className,
            n = e.style,
            r = e.onClick;
          return (0, a.jsxs)("div", {
            style: n,
            className: " rightNav_default ".concat(t.join(" ")),
            onClick: r,
            "aria-hidden": "true",
            children: [
              (0, a.jsx)(b, {
                text: "\uce74\ud14c\uace0\ub9ac \ub0b4 \uc5f0\uad00 \ud398\uc774\uc9c0",
              }),
              (0, a.jsx)(b, { text: "\ud14c\uc2a4\ud2b8 \ubb38\uad6c" }),
            ],
          });
        };
      x.defaultProps = { className: [], style: {}, onClick: function () {} };
      var w = x,
        j = function (e) {
          var t = e.style,
            n = e.placeHolder,
            r = e.className;
          return (0, a.jsx)("input", {
            style: t,
            placeholder: n,
            className: "input_default ".concat(r.join(" ")),
          });
        };
      j.defaultProps = { style: {}, className: [] };
      var N = j,
        _ = function (e) {
          var t = e.style,
            n = e.className;
          return (0, a.jsxs)("div", {
            style: t,
            className: "searchBox_default ".concat(n.join(" ")),
            children: [
              (0, a.jsx)(N, { placeHolder: "Search Documentation" }),
              (0, a.jsx)(c, { className: "findIconButton_default" }),
            ],
          });
        };
      _.defaultProps = { style: {}, className: [] };
      var k = _,
        O = function (e) {
          var t = e.className,
            n = e.style,
            r = e.buttons;
          return (0, a.jsxs)("div", {
            style: n,
            className: "header_default ".concat(t.join(" ")),
            children: [(0, a.jsx)(k, {}), (0, a.jsx)(d, { buttons: r })],
          });
        };
      O.defaultProps = { className: [], style: {} };
      var z = O,
        S = function (e) {
          var t = e.className,
            n = e.style;
          return (0, a.jsxs)("div", {
            style: n,
            className: "article_default ".concat(t.join(" ")),
            children: [
              (0, a.jsx)(b, { text: "kiwi wiki" }),
              (0, a.jsx)(b, {
                text: "\ud0a4\uc704 \uc704\ud0a4\ub294 \uac70\uafb8\ub85c \ud574\ub3c4 \ud0a4\uc704\uc704\ud0a4",
              }),
            ],
          });
        };
      S.defaultProps = { className: [], style: {} };
      var A = S,
        C = [
          "Home",
          "Cloud",
          "Platform",
          "Connectors",
          "Tools",
          "Clients",
          "Login",
        ],
        P = function (e) {
          var t = e.className,
            n = e.style,
            r = e.onClick;
          return (0, a.jsxs)("div", {
            style: n,
            className: "main_structure_wholeBox ".concat(t.join(" ")),
            onClick: r,
            "aria-hidden": "true",
            children: [
              (0, a.jsx)(h, { image: "/static/logos/logo.png" }),
              (0, a.jsxs)("div", {
                className: "main_structure_rightBox",
                children: [
                  (0, a.jsx)(z, { buttons: C }),
                  (0, a.jsxs)("div", {
                    className: "main_structure_rightBox_2",
                    children: [(0, a.jsx)(A, {}), (0, a.jsx)(w, {})],
                  }),
                ],
              }),
            ],
          });
        };
      P.defaultProps = { className: [], style: {}, onClick: function () {} };
      var E = P,
        I = function () {
          return (0, a.jsx)(a.Fragment, { children: (0, a.jsx)(E, {}) });
        };
    },
    8921: function (e, t, n) {
      (window.__NEXT_P = window.__NEXT_P || []).push([
        "/test",
        function () {
          return n(2563);
        },
      ]);
    },
    5026: function (e, t) {
      "use strict";
      Object.defineProperty(t, "__esModule", { value: !0 }),
        (t.imageConfigDefault = t.VALID_LOADERS = void 0);
      t.VALID_LOADERS = ["default", "imgix", "cloudinary", "akamai", "custom"];
      t.imageConfigDefault = {
        deviceSizes: [640, 750, 828, 1080, 1200, 1920, 2048, 3840],
        imageSizes: [16, 32, 48, 64, 96, 128, 256, 384],
        path: "/_next/image",
        loader: "default",
        domains: [],
        disableStaticImages: !1,
        minimumCacheTTL: 60,
      };
    },
    4212: function (e, t, n) {
      e.exports = n(2236);
    },
    4086: function (e, t, n) {
      "use strict";
      n.d(t, {
        w_: function () {
          return l;
        },
      });
      var r = n(6687),
        a = {
          color: void 0,
          size: void 0,
          className: void 0,
          style: void 0,
          attr: void 0,
        },
        i = r.createContext && r.createContext(a),
        o = function () {
          return (o =
            Object.assign ||
            function (e) {
              for (var t, n = 1, r = arguments.length; n < r; n++)
                for (var a in (t = arguments[n]))
                  Object.prototype.hasOwnProperty.call(t, a) && (e[a] = t[a]);
              return e;
            }).apply(this, arguments);
        },
        s = function (e, t) {
          var n = {};
          for (var r in e)
            Object.prototype.hasOwnProperty.call(e, r) &&
              t.indexOf(r) < 0 &&
              (n[r] = e[r]);
          if (null != e && "function" === typeof Object.getOwnPropertySymbols) {
            var a = 0;
            for (r = Object.getOwnPropertySymbols(e); a < r.length; a++)
              t.indexOf(r[a]) < 0 &&
                Object.prototype.propertyIsEnumerable.call(e, r[a]) &&
                (n[r[a]] = e[r[a]]);
          }
          return n;
        };
      function c(e) {
        return (
          e &&
          e.map(function (e, t) {
            return r.createElement(e.tag, o({ key: t }, e.attr), c(e.child));
          })
        );
      }
      function l(e) {
        return function (t) {
          return r.createElement(u, o({ attr: o({}, e.attr) }, t), c(e.child));
        };
      }
      function u(e) {
        var t = function (t) {
          var n,
            a = e.attr,
            i = e.size,
            c = e.title,
            l = s(e, ["attr", "size", "title"]),
            u = i || t.size || "1em";
          return (
            t.className && (n = t.className),
            e.className && (n = (n ? n + " " : "") + e.className),
            r.createElement(
              "svg",
              o(
                {
                  stroke: "currentColor",
                  fill: "currentColor",
                  strokeWidth: "0",
                },
                t.attr,
                a,
                l,
                {
                  className: n,
                  style: o(o({ color: e.color || t.color }, t.style), e.style),
                  height: u,
                  width: u,
                  xmlns: "http://www.w3.org/2000/svg",
                }
              ),
              c && r.createElement("title", null, c),
              e.children
            )
          );
        };
        return void 0 !== i
          ? r.createElement(i.Consumer, null, function (e) {
              return t(e);
            })
          : t(a);
      }
    },
  },
  function (e) {
    e.O(0, [401, 774, 888, 179], function () {
      return (t = 8921), e((e.s = t));
      var t;
    });
    var t = e.O();
    _N_E = t;
  },
]);
