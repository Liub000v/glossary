package com.practice.webglossary.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MainController {

    @GetMapping("/")
    public String glossary(Model model) {
        model.addAttribute("title", "Glossary");
        return "glossary";
    }

    @GetMapping("/mindmap")
    public String mindmap() {
        return "mindmap";
    }

    @GetMapping("/WebGL")
    @ResponseBody
    public String webgl() {
        return "WebGL - программная библиотека для языка JavaScript предназначенная для визуализации интерактивной трёхмерной графики и двухмерной графики в пределах совместимости веб-браузера без использования плагинов.";
    }

    @GetMapping("/OpenGL")
    @ResponseBody
    public String opengl() {
        return "OpenGL – спецификация, определяющая платформонезависимый программный интерфейс для написания приложений, использующих двумерную и трёхмерную компьютерную графику.\n";
    }

    @GetMapping("/Canvas")
    @ResponseBody
    public String canvas() {
        return "Canvas – элемент HTML5, в котором можно располагать 3d графику.";
    }

    @GetMapping("/Blend4Web")
    @ResponseBody
    public String blend4web() {
        return "Blend4Web — открытый фреймворк, предназначенный для создания и отображения интерактивной трёхмерной графики в браузерах.";
    }

    @GetMapping("/svg")
    @ResponseBody
    public String svg() {
        return "Элемент svg в HTML5 предоставляет область для отображения SVG-файлов.";
    }

    @GetMapping("/javascript")
    @ResponseBody
    public String javascript() {
        return "JavaScript — прототипно-ориентированный сценарный язык программирования. Является реализацией языка ECMAScript.";
    }

    @GetMapping("/babylon")
    @ResponseBody
    public String babylon() {
        return "Babylon - фреймворк javascript, который используется для рендеринга графики в веб-приложениях.";
    }

    @GetMapping("/aframe")
    @ResponseBody
    public String aframe() {
        return "Aframe - это среда javascript предоставляет разработчикам возможность разрабатывать проекты виртуальной реальности, которые могут отображаться в браузерах.";
    }

    @GetMapping("/cannotjs")
    @ResponseBody
    public String cannotjs() {
        return "Cannot.js - это движок javascript, предназначенный для улучшения разработки веб-игр. Он воспроизводит физическую среду в вебе: вводит простое обнаружение столкновений различных форм тела, контактов, трений и т.д.";
    }

    @GetMapping("/lightgl")
    @ResponseBody
    public String lightgl() {
        return "LightGL.js - основан на фреймворке WebGL и считается самой быстрой и легкой библиотекой для рендеринга 3D в браузере.";
    }

    @GetMapping("/playcanvas")
    @ResponseBody
    public String playcanvas() {
        return "PlayCanvas — игровой движок, использующий как HTML5, так и WebGL для создания игр и других интерактивных 3D-компонентов.";
    }

    @GetMapping("/phoriajs")
    @ResponseBody
    public String phoriajs() {
        return "PhoriaJs предназначен для визуализации веб-эффектов движения с использованием элементов холста HTML5. Он не основан на WebGL.";
    }

    @GetMapping("/d3")
    @ResponseBody
    public String d3() {
        return "D3 - позволяет отображать потрясающие визуальные информационные отчеты, диаграммы, графики и иллюстрации.";
    }

    @GetMapping("/Blender")
    @ResponseBody
    public String blender() {
        return "Blender - профессиональное свободное и открытое программное обеспечение для создания трёхмерной компьютерной графики, включающее в себя средства моделирования, скульптинга, анимации, симуляции, рендеринга, постобработки и монтажа видео со звуком, компоновки с помощью «узлов», а также создания 2D-анимаций.";
    }

    @GetMapping("/threejs")
    @ResponseBody
    public String threeJs() {
        return "Three.js  — легковесная кроссбраузерная библиотека JavaScript, используемая для создания и отображения анимированной компьютерной 3D графики при разработке веб-приложений. ";
    }

    @GetMapping("/hlsl")
    @ResponseBody
    public String hlsl() {
        return "The High-Level Shader Language — C-подобный язык высокого уровня для программирования шейдеров. Был создан корпорацией Microsoft и включён в пакет DirectX.";
    }

    @GetMapping("/directx")
    @ResponseBody
    public String directX() {
        return "DirectX - это набор API, разработанных для решения задач, связанных с программированием под Microsoft Windows. Наиболее широко используется при написании компьютерных игр.";
    }

    @GetMapping("/glsl")
    @ResponseBody
    public String glsl() {
        return "OpenGL Shading Language - язык высокого уровня для программирования шейдеров. Разработан для выполнения математики, которая обычно требуется для выполнения растеризации графики.\n";
    }

    @GetMapping("/gpu")
    @ResponseBody
    public String gpu() {
        return "Graphics processing unit - отдельное устройство персонального компьютера или игровой приставки, выполняющее графический рендеринг";
    }

    @GetMapping("/shaders")
    @ResponseBody
    public String shaders() {
        return "Шейдеры - это функция, которая требуется для отображения чего-либо на экране. Шейдер запускается в GPU (graphics processing unit), который оптимизирован для выполнения подобных операций. Существует два типа шейдеров: вершинные шейдеры и фрагментные (пиксельные) шейдеры. Вершинные шейдеры изменяют положение фигуры в системе 3D координат. Фрагментные шейдеры рассчитывают цвет и другие атрибуты отображения.";
    }

    @GetMapping("/ewgl-matrices")
    @ResponseBody
    public String ewglMatrices() {
        return "ewgl-matrices - библиотека для работы с матрицами для WebGL.";
    }

    @GetMapping("/glMatrix")
    @ResponseBody
    public String glMatrix() {
        return "glMatrix - библиотека для работы с матрицами и векторами, написанная на JavaScript, предназначенная для высокопроизводительных приложений на WebGL.";
    }

    @GetMapping("/mjs")
    @ResponseBody
    public String mjs() {
        return "mjs - математическая библиотека для работы с векторами и матрицами, написанная на JavaScript, оптимизированная для использования с WebGL.";
    }

    @GetMapping("/spline")
    @ResponseBody
    public String spline() {
        return "Spline - это бесплатный редактор 3D-объектов для web-приложений, используется веб-дизайнерами.";
    }

    @GetMapping("/verge3D")
    @ResponseBody
    public String verge3D() {
        return "Verge3D — 3D рендерер реального времени и сопутствующий инструментарий, предназначенный для создания и отображения интерактивной трёхмерной графики в браузерах, основанное частью участников проекта коммерческое ответвление Blend4Web.";
    }

    @GetMapping("/vrml")
    @ResponseBody
    public String vrml() {
        return "Virtual Reality Markup Language - язык разметки виртуальной реальности (VRML), который позволял веб-страницам отображать формы, освещение, звук и разработчикам создавать интерактивные трехмерные миры в 1994.";
    }

    @GetMapping("/adobeFlash")
    @ResponseBody
    public String adobeFlash() {
        return "Adobe Flash - мультимедийная платформа компании Adobe Systems для создания веб-приложений или мультимедийных презентаций. Использовалась для создания рекламных баннеров, анимации, игр, а также воспроизведения на веб-страницах видео- и аудиозаписей.";
    }

    @GetMapping("/unity")
    @ResponseBody
    public String unity() {
        return "Unity — межплатформенная среда разработки компьютерных игр, разработанная американской компанией Unity Technologies. Unity позволяет создавать приложения, работающие на более чем 25 различных платформах, включающих персональные компьютеры, игровые консоли, мобильные устройства, интернет-приложения и другие.";
    }

    @GetMapping("/osl")
    @ResponseBody
    public String osl() {
        return "Open Shading Language - это язык шейдинга, разработанный Sony Pictures Imageworks для использования 3d-объектов (света и текстур) в фильмах.";
    }
}
