// Smooth scrolling for anchor links
document.addEventListener("DOMContentLoaded", () => {
    const links = document.querySelectorAll('nav ul li a');

    for (const link of links) {
        link.addEventListener('click', (event) => {
            event.preventDefault();
            const targetId = event.currentTarget.getAttribute("href").substring(1);
            const targetElement = document.getElementById(targetId);

            window.scrollTo({
                top: targetElement.offsetTop - 70, // Adjust the offset to account for the fixed nav bar
                behavior: "smooth"
            });
        });
    }
});
