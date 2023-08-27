		function addOption(selectElement, value, text) {
			const option = document.createElement("option");
			option.value = value;
			option.textContent = text;
			selectElement.appendChild(option);
		}

		function updateLocationOptions() {
			const selectedLocation = getSelectedLocation();
			if (selectedLocation === "date") {
				updateDateOptions();
			} else if (selectedLocation === "time") {
				updateTimeOptions();
			} else {
				updateRoomOptions(selectedLocation);
			}
		}

		function updateRoomOptions(selectedLocation) {
			const roomSelect = document.getElementById("roomSelect");
			roomSelect.innerHTML = "";

			const roomCount = (selectedLocation === "Jj1") ? 4 : 3;
			for (let i = 1; i <= roomCount; i++) {
				const roomValue = selectedLocation + ".h" + i;
				const roomText = i + "호실";
				addOption(roomSelect, roomValue, roomText);
			}
		}

		function updateDateOptions() {
			const dateSelect = document.getElementById("dateSelect");
			dateSelect.innerHTML = "";

			const currentDate = new Date();
			currentDate.setDate(currentDate.getDate()); // 오늘 설정

			const endDate = new Date();
			endDate.setMonth(currentDate.getMonth() + 1); // 한 달 뒤까지

			while (currentDate <= endDate) {
				const dateString = currentDate.toISOString().slice(0, 10);
				const dateText = dateString;
				addOption(dateSelect, dateString, dateText);
				currentDate.setDate(currentDate.getDate() + 1);
			}
			updateTimeOptions(); // 날짜 옵션이 업데이트되면 동시에 시간 옵션도 업데이트
		}

		function updateTimeOptions() {
			const timeSelect = document.getElementById("timeSelect");
			timeSelect.innerHTML = "";

			const selectedDate = document.getElementById("dateSelect").value;
			const currentDate = new Date();
			const selectedDateTime = new Date(selectedDate);

			if (selectedDateTime.toDateString() === currentDate.toDateString()) {
				const startHour = Math.max(currentDate.getHours() + 3, 9);
				for (let hour = startHour; hour <= 21; hour += 1) {
					const timeString = hour.toString().padStart(2, "0") + ":00";
					const timeText = timeString;
					addOption(timeSelect, timeString, timeText);
				}
			} else {
				for (let hour = 9; hour <= 22; hour += 1) {
					const timeString = hour.toString().padStart(2, "0") + ":00";
					const timeText = timeString;
					addOption(timeSelect, timeString, timeText);
				}
			}
		}

		updateDateOptions();
		updateRoomOptions();/**
 * 
 */