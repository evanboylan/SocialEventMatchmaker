import {displayUserView} from "./user.js";

const containerEl = document.querySelector(".container");

buildHeader();
buildMainElement();
buildFooter();

function clearChildren(element) {
    while (element.firstChild) {
        element.removeChild(element.lastChild);
    }
};

function buildHeader() {
    const sectionEl = document.createElement("section");

    const helloEl = document.createElement("p");
    helloEl.innerText = "Hello";

    sectionEl.append(helloEl);
    containerEl.append(sectionEl);
}

function buildMainElement(){

    const mainEl = document.createElement("main");
    mainEl.classList.add("main-content");
    containerEl.appendChild(mainEl);
    fetch("/users/3")
    .then(res => res.json())
    .then(user => {
        displayUserView(mainEl, user);
    })
}

function buildFooter() {
    const footerEl = document.createElement("footer");
    const footerDivEl = document.createElement("div");
    footerDivEl.classList.add("footer_text");
    const footerTextEl = document.createElement("p");
    footerTextEl.innerText = "Josh and Evan - 2022";
    footerDivEl.appendChild(footerTextEl);
    footerEl.appendChild(footerDivEl);
    containerEl.appendChild(footerEl);
}

export {
    clearChildren
};
