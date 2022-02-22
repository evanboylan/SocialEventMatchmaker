import {
    clearChildren
} from "./app.js"

function dispalyUserView(mainEl, user){

    const userDisplaySectionEl = document.createElement("div");
    userDisplaySectionEl.classList.add("user_display_section");

    const userImgNameDivEl = document.createElement("div");
    userImgNameDivEl.classList.add("user_pic_name");

    const userImgEl = document.createElement("img");
    userImgEl.src = user.imgUrl;
    userImgEl.classList.add("user_img");

    const userNameEl = document.createElement("p");
    userNameEl.src = user.name;
    userNameEl.classList.add("user_name");

    userImgNameDivEl.appendChild(userImgEl);
    userImgNameDivEl.appendChild(userNameEl);

    userDisplaySectionEl.appendChild(userImgNameDivEl);

    const userEventsSectionEl= document.createElement("div");
    userEventsSectionEl.classList.add("user_events_div");

    user.events.forEach(event => {

        const eventInfoSectionEl = document.createElement("div");
        eventInfoSectionEl.classList.add("event_info_section");

        const eventImageEl = document.createElement("img");
        eventImageEl.classList.add("event_img");
        eventImageEl.src = event.imgUrl;

        const eventDetailsEl = document.createElement("div");
        eventDetailsEl.classList.add("event_details_section");

        const eventDateTitleEl = document.createElement("p");
        eventDateTitleEl.src = event.eventDate;
        eventDateTitleEl.classList.add("event_date_title");

        const eventHeadlinerEl = document.createElement("p");
        eventHeadlinerEl.src = event.headliner;
        eventHeadlinerEl.classList.add("event_headliner");

        eventDetailsEl.appendChild(eventDateTitleEl);
        eventDetailsEl.appendChild(eventHeadlinerEl);
        eventDetailsEl.appendChild(eventWhenWhereDetailsSectionEl);

        const eventWhenWhereDetailsSectionEl = document.createElement("div");
        eventWhenWhereDetailsSectionEl.classList.add("when_where_details_section");

        const eventVenueEl = document.createElement("p");
        eventVenueEl.src = event.venue;

        const eventDateEl = document.createElement("p");
        eventDateEl.src = event.eventDate;

        const eventTimeEl = document.createElement("p");
        eventTimeEl.src = event.eventTimeEl;

        eventWhenWhereDetailsSectionEl.appendChild(eventVenueEl);
        eventWhenWhereDetailsSectionEl.appendChild(eventDateEl);
        eventWhenWhereDetailsSectionEl.appendChild(eventTimeEl);

        eventInfoSectionEl.appendChild(eventImageEl);
        eventInfoSectionEl.appendChild(eventDetailsEl);
    
        userEventsSectionEl.appendChild(eventInfoSectionEl);
    })

    userDisplaySectionEl.appendChild(userEventsSectionEl);

    mainEl.appendChild(userDisplaySectionEl);
}

export {
    dispalyUserView
};