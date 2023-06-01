/*! For license information please see ipywidgetsRenderer.js.LICENSE.txt */
var e={860:(e,t,n)=>{n.d(t,{Z:()=>c});var r=n(537),o=n.n(r),i=n(645),s=n.n(i)()(o());s.push([e.id,".cell-output-ipywidget-background {\r\n    background: white !important;\r\n}\r\n","",{version:3,sources:["webpack://./src/webviews/webview-side/ipywidgets/renderer/styles.css"],names:[],mappings:"AAAA;IACI,4BAA4B;AAChC",sourcesContent:[".cell-output-ipywidget-background {\r\n    background: white !important;\r\n}\r\n"],sourceRoot:""}]);const c=s},645:e=>{e.exports=function(e){var t=[];return t.toString=function(){return this.map((function(t){var n="",r=void 0!==t[5];return t[4]&&(n+="@supports (".concat(t[4],") {")),t[2]&&(n+="@media ".concat(t[2]," {")),r&&(n+="@layer".concat(t[5].length>0?" ".concat(t[5]):""," {")),n+=e(t),r&&(n+="}"),t[2]&&(n+="}"),t[4]&&(n+="}"),n})).join("")},t.i=function(e,n,r,o,i){"string"==typeof e&&(e=[[null,e,void 0]]);var s={};if(r)for(var c=0;c<this.length;c++){var a=this[c][0];null!=a&&(s[a]=!0)}for(var u=0;u<e.length;u++){var d=[].concat(e[u]);r&&s[d[0]]||(void 0!==i&&(void 0===d[5]||(d[1]="@layer".concat(d[5].length>0?" ".concat(d[5]):""," {").concat(d[1],"}")),d[5]=i),n&&(d[2]?(d[1]="@media ".concat(d[2]," {").concat(d[1],"}"),d[2]=n):d[2]=n),o&&(d[4]?(d[1]="@supports (".concat(d[4],") {").concat(d[1],"}"),d[4]=o):d[4]="".concat(o)),t.push(d))}},t}},537:e=>{e.exports=function(e){var t=e[1],n=e[3];if(!n)return t;if("function"==typeof btoa){var r=btoa(unescape(encodeURIComponent(JSON.stringify(n)))),o="sourceMappingURL=data:application/json;charset=utf-8;base64,".concat(r),i="/*# ".concat(o," */"),s=n.sources.map((function(e){return"/*# sourceURL=".concat(n.sourceRoot||"").concat(e," */")}));return[t].concat(s).concat([i]).join("\n")}return[t].join("\n")}},379:e=>{var t=[];function n(e){for(var n=-1,r=0;r<t.length;r++)if(t[r].identifier===e){n=r;break}return n}function r(e,r){for(var i={},s=[],c=0;c<e.length;c++){var a=e[c],u=r.base?a[0]+r.base:a[0],d=i[u]||0,l="".concat(u," ").concat(d);i[u]=d+1;var p=n(l),f={css:a[1],media:a[2],sourceMap:a[3],supports:a[4],layer:a[5]};if(-1!==p)t[p].references++,t[p].updater(f);else{var v=o(f,r);r.byIndex=c,t.splice(c,0,{identifier:l,updater:v,references:1})}s.push(l)}return s}function o(e,t){var n=t.domAPI(t);return n.update(e),function(t){if(t){if(t.css===e.css&&t.media===e.media&&t.sourceMap===e.sourceMap&&t.supports===e.supports&&t.layer===e.layer)return;n.update(e=t)}else n.remove()}}e.exports=function(e,o){var i=r(e=e||[],o=o||{});return function(e){e=e||[];for(var s=0;s<i.length;s++){var c=n(i[s]);t[c].references--}for(var a=r(e,o),u=0;u<i.length;u++){var d=n(i[u]);0===t[d].references&&(t[d].updater(),t.splice(d,1))}i=a}}},569:e=>{var t={};e.exports=function(e,n){var r=function(e){if(void 0===t[e]){var n=document.querySelector(e);if(window.HTMLIFrameElement&&n instanceof window.HTMLIFrameElement)try{n=n.contentDocument.head}catch(e){n=null}t[e]=n}return t[e]}(e);if(!r)throw new Error("Couldn't find a style target. This probably means that the value for the 'insert' parameter is invalid.");r.appendChild(n)}},216:e=>{e.exports=function(e){var t=document.createElement("style");return e.setAttributes(t,e.attributes),e.insert(t,e.options),t}},565:(e,t,n)=>{e.exports=function(e){var t=n.nc;t&&e.setAttribute("nonce",t)}},795:e=>{e.exports=function(e){var t=e.insertStyleElement(e);return{update:function(n){!function(e,t,n){var r="";n.supports&&(r+="@supports (".concat(n.supports,") {")),n.media&&(r+="@media ".concat(n.media," {"));var o=void 0!==n.layer;o&&(r+="@layer".concat(n.layer.length>0?" ".concat(n.layer):""," {")),r+=n.css,o&&(r+="}"),n.media&&(r+="}"),n.supports&&(r+="}");var i=n.sourceMap;i&&"undefined"!=typeof btoa&&(r+="\n/*# sourceMappingURL=data:application/json;base64,".concat(btoa(unescape(encodeURIComponent(JSON.stringify(i))))," */")),t.styleTagTransform(r,e,t.options)}(t,e,n)},remove:function(){!function(e){if(null===e.parentNode)return!1;e.parentNode.removeChild(e)}(t)}}}},589:e=>{e.exports=function(e,t){if(t.styleSheet)t.styleSheet.cssText=e;else{for(;t.firstChild;)t.removeChild(t.firstChild);t.appendChild(document.createTextNode(e))}}}},t={};function n(r){var o=t[r];if(void 0!==o)return o.exports;var i=t[r]={id:r,exports:{}};return e[r](i,i.exports,n),i.exports}n.n=e=>{var t=e&&e.__esModule?()=>e.default:()=>e;return n.d(t,{a:t}),t},n.d=(e,t)=>{for(var r in t)n.o(t,r)&&!n.o(e,r)&&Object.defineProperty(e,r,{enumerable:!0,get:t[r]})},n.g=function(){if("object"==typeof globalThis)return globalThis;try{return this||new Function("return this")()}catch(e){if("object"==typeof window)return window}}(),n.o=(e,t)=>Object.prototype.hasOwnProperty.call(e,t),n.nc=void 0;var r={};(()=>{n.d(r,{Q:()=>j});var e=function(t,n){return e=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(e,t){e.__proto__=t}||function(e,t){for(var n in t)Object.prototype.hasOwnProperty.call(t,n)&&(e[n]=t[n])},e(t,n)};function t(e,t,n,r){return new(n||(n=Promise))((function(o,i){function s(e){try{a(r.next(e))}catch(e){i(e)}}function c(e){try{a(r.throw(e))}catch(e){i(e)}}function a(e){var t;e.done?o(e.value):(t=e.value,t instanceof n?t:new n((function(e){e(t)}))).then(s,c)}a((r=r.apply(e,t||[])).next())}))}function o(e,t){var n,r,o,i,s={label:0,sent:function(){if(1&o[0])throw o[1];return o[1]},trys:[],ops:[]};return i={next:c(0),throw:c(1),return:c(2)},"function"==typeof Symbol&&(i[Symbol.iterator]=function(){return this}),i;function c(i){return function(c){return function(i){if(n)throw new TypeError("Generator is already executing.");for(;s;)try{if(n=1,r&&(o=2&i[0]?r.return:i[0]?r.throw||((o=r.return)&&o.call(r),0):r.next)&&!(o=o.call(r,i[1])).done)return o;switch(r=0,o&&(i=[2&i[0],o.value]),i[0]){case 0:case 1:o=i;break;case 4:return s.label++,{value:i[1],done:!1};case 5:s.label++,r=i[1],i=[0];continue;case 7:i=s.ops.pop(),s.trys.pop();continue;default:if(!((o=(o=s.trys).length>0&&o[o.length-1])||6!==i[0]&&2!==i[0])){s=0;continue}if(3===i[0]&&(!o||i[1]>o[0]&&i[1]<o[3])){s.label=i[1];break}if(6===i[0]&&s.label<o[1]){s.label=o[1],o=i;break}if(o&&s.label<o[2]){s.label=o[2],s.ops.push(i);break}o[2]&&s.ops.pop(),s.trys.pop();continue}i=t.call(e,s)}catch(e){i=[6,e],r=0}finally{n=o=0}if(5&i[0])throw i[1];return{value:i[0]?i[1]:void 0,done:!0}}([i,c])}}}Object.create,Object.create;var i=n(379),s=n.n(i),c=n(795),a=n.n(c),u=n(569),d=n.n(u),l=n(565),p=n.n(l),f=n(216),v=n.n(f),h=n(589),g=n.n(h),y=n(860),m={};m.styleTagTransform=g(),m.setAttributes=p(),m.insert=d().bind(null,"head"),m.domAPI=a(),m.insertStyleElement=v(),s()(y.Z,m),y.Z&&y.Z.locals&&y.Z.locals;var w=function(){function e(e){void 0===e&&(e=null);var t=this;this.scope=e,this._resolved=!1,this._rejected=!1,this._promise=new Promise((function(e,n){t._resolve=e,t._reject=n}))}return Object.defineProperty(e.prototype,"value",{get:function(){return this._value},enumerable:!1,configurable:!0}),e.prototype.resolve=function(e){this._value=e,this._resolve.apply(this.scope?this.scope:this,arguments),this._resolved=!0},e.prototype.reject=function(e){this._reject.apply(this.scope?this.scope:this,arguments),this._rejected=!0},Object.defineProperty(e.prototype,"promise",{get:function(){return this._promise},enumerable:!1,configurable:!0}),Object.defineProperty(e.prototype,"resolved",{get:function(){return this._resolved},enumerable:!1,configurable:!0}),Object.defineProperty(e.prototype,"rejected",{get:function(){return this._rejected},enumerable:!1,configurable:!0}),Object.defineProperty(e.prototype,"completed",{get:function(){return this._rejected||this._resolved},enumerable:!1,configurable:!0}),e}();function b(e){return void 0===e&&(e=null),new w(e)}new Promise((function(){})),function(){function e(){this.currentPromise=Promise.resolve(void 0)}e.prototype.chain=function(e){return t(this,void 0,Promise,(function(){var n,r,i=this;return o(this,(function(s){switch(s.label){case 0:return n=b(),r=this.currentPromise,this.currentPromise=this.currentPromise.then((function(){return t(i,void 0,void 0,(function(){var t,r;return o(this,(function(o){switch(o.label){case 0:return o.trys.push([0,2,,3]),[4,e()];case 1:return t=o.sent(),n.resolve(t),[3,3];case 2:throw r=o.sent(),n.reject(r),r;case 3:return[2]}}))}))})),[4,r];case 1:return s.sent(),[2,n.promise]}}))}))},e.prototype.chainFinally=function(e){var t=b();return this.currentPromise=this.currentPromise.finally((function(){return e().then((function(e){return t.resolve(e)})).catch((function(e){return t.reject(e)}))})),t.promise}}();var P=function(t){function n(){var e=t.call(this)||this;return e.name="vscode.fallbackToNextRenderer",e}return function(t,n){if("function"!=typeof n&&null!==n)throw new TypeError("Class extends value "+String(n)+" is not a constructor or null");function r(){this.constructor=t}e(t,n),t.prototype=null===n?Object.create(n):(r.prototype=n.prototype,new r)}(n,t),n}(Error),j=function(e){var r=function(t,n){e.postMessage&&e.postMessage({command:"log",message:t,category:n}),"error"===n&&console.error(t)};r("Jupyter IPyWidget Renderer Activated"),function(e){var t=window;t.widgetEntryPoint&&"function"==typeof t.widgetEntryPoint.initialize?t.widgetEntryPoint.initialize(e):e.postMessage&&e.postMessage({command:"log",message:"Hook not registered"})}(e);var i=new Map,s=b();function c(n){return t(this,void 0,Promise,(function(){var t;return o(this,(function(r){return e.postMessage?(t=b(),i.set(n,t),e.postMessage({command:"query-widget-state",model_id:n}),[2,t.promise]):[2,{hasWidgetState:!1,kernelSelected:!1}]}))}))}return e.postMessage&&e.postMessage({command:"ipywidget-renderer-loaded"}),e.onDidReceiveMessage&&e.onDidReceiveMessage((function(e){return t(void 0,void 0,void 0,(function(){var t,n,c,a,u,d;return o(this,(function(o){switch(o.label){case 0:return"query-widget-state"===e.command&&e.model_id&&(null===(d=i.get(e.model_id))||void 0===d||d.resolve(e)),"ipywidget-renderer-init"!==e.command?[3,5]:(t=window.ipywidgetsKernel,e.version?(n=new Promise((function(e){var t=function(){if(window.vscIPyWidgets7)return e();setTimeout(t,500)};setTimeout(t,500)})),c=new Promise((function(e){var t=function(){if(window.vscIPyWidgets8)return e();setTimeout(t,500)};setTimeout(t,500)})),[4,Promise.all([n,c])]):[3,2]);case 1:o.sent(),a=function(){try{window.vscIPyWidgets8.unload()}catch(e){}},u=function(){try{window.vscIPyWidgets7.unload()}catch(e){}},7===e.version?(a(),window.vscIPyWidgets7.load(),r("Loaded IPYWidgets 7.x","info")):8===e.version&&(u(),window.vscIPyWidgets8.load(),r("Loaded IPYWidgets 8.x","info")),o.label=2;case 2:return e.widgetState&&t&&e.version?[4,t.restoreWidgets(e.widgetState)]:[3,4];case 3:return o.sent(),s.resolve(Object.assign({},e,{widgetStateLoaded:!0})),[3,5];case 4:s.resolve(Object.assign({},e,{widgetStateLoaded:!1})),o.label=5;case 5:return[2]}}))}))})),{renderOutputItem:function(i,s,a){return t(this,void 0,void 0,(function(){var a,u,d,l,p,f,v,h;return o(this,(function(g){switch(g.label){case 0:r("Got item for Rendering ".concat(i.id,"}")),g.label=1;case 1:if(g.trys.push([1,6,7,8]),a=function(e){return e.mime.toLowerCase().includes("json")?e.json():e.text()}(i),!a)throw r("Error: Model not found to render output ".concat(i.id),"error"),new P;return u=function(){return t(this,void 0,void 0,(function(){var e;return o(this,(function(t){return e=new Promise((function(e){var t=function(){var r,o,i=(null===(r=window.ipywidgetsKernel)||void 0===r?void 0:r.renderOutput)||(null===(o=n.g.ipywidgetsKernel)||void 0===o?void 0:o.renderOutput);i?(window.ipywidgetsKernel.initialize(),e(i)):setTimeout(t,100)};t()})),[2,e]}))}))}(),[4,c(a.model_id)];case 2:return d=g.sent(),l=d.hasWidgetState,p=d.kernelSelected,l&&p?[4,u]:[3,4];case 3:return v=g.sent(),[3,5];case 4:v=void 0,g.label=5;case 5:if(f=v,!l)throw r("Model not found in Kernel state to render output ".concat(i.id,", rendering a fallback mime type"),"info"),new P;if(!p)throw r("No Kernel selected, hence not rendering widget output ".concat(i.id),"error"),new P;if(f)return r("Rendering ".concat(i.id," widget renderer found *************")),s.className=(s.className||"")+" cell-output-ipywidget-background",[2,f(i,a,s,r,c)];throw new P;case 6:throw h=g.sent(),"Failed to render output ".concat(i.id,", ").concat(h),h;case 7:return function(e,t,n){var r=window;r.widgetEntryPoint&&"function"==typeof r.widgetEntryPoint.renderOutputItem&&(e.postMessage&&e.postMessage({command:"log",message:"rendering output"}),r.widgetEntryPoint.renderOutputItem(t,n))}(e,i,s),[7];case 8:return[2]}}))}))},disposeOutputItem:function(e){var t,o;r("Disposing rendered output for ".concat(e));var i=(null===(t=window.ipywidgetsKernel)||void 0===t?void 0:t.disposeOutput)||(null===(o=n.g.ipywidgetsKernel)||void 0===o?void 0:o.disposeOutput);if(i)return i(e)}}}})();var o=r.Q;export{o as activate};
//# sourceMappingURL=ipywidgetsRenderer.js.map