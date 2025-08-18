/**
 * 
 */

document.addEventListener('DOMContentLoaded', function() {
	const checkbox = document.querySelector('#agree');
	const proceedBtn = document.querySelector('#proceed');
	
	checkbox.addEventListener('change', function() {
/*		if (this.checked) {
			proceedBtn.classList.remove('disabled');
			proceedBtn.classList.add('enabled');
			proceedBtn.disabled = false;
		} else {
			proceedBtn.classList.remove('enabled');
			proceedBtn.classList.add('disabled');
			proceedBtn.disabled = true;
		}*/
		
		proceedBtn.classList.toggle('disabled', !this.checkecd);
		proceedBtn.classList.toggle('enabled', this.checkecd);
		proceedBtn.disabled = !this.checked;
	});
});