window.onload = () => {
    const addButton = document.getElementById(`AddButton`);
    const addPanel = document.getElementById(`AddPanel`);
    addPanel.hidden = true;
    const bookNameText = document.getElementById(`BookNameText`);
    const expositionText = document.getElementById(`ExpositionText`);
    const pagesCounter = document.getElementById(`PagesCounter`);
    const addPanelSubmitButton = document.getElementById(`AddPanelSubmitButton`);

    addButton.onclick = () => {
        addPanel.hidden = false;
    }

    addPanelSubmitButton.onclick = () => {
        let request = new XMLHttpRequest();
        request.open("POST", "/add");
        request.setRequestHeader("Content-Type", "application/json");
        request.send(JSON.stringify({
            date: new Date,
            bookName: bookNameText.value,
            pagesCount: parseInt(pagesCounter.value),
            exposition: expositionText.value,
        }))
    }
}