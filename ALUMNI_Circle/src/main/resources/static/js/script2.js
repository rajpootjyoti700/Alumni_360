document.addEventListener('DOMContentLoaded', () => {
    const background = document.createElement('div');
    background.className = 'background-animation';
    document.body.appendChild(background);

    window.addEventListener('scroll', () => {
        const scrollY = window.scrollY;
        const bodyHeight = document.body.scrollHeight - window.innerHeight;
        const scrollPercent = (scrollY / bodyHeight);
        const animationPosition = scrollPercent * 400; // Adjust for smooth transition

        background.style.backgroundPosition = `${animationPosition}% 50%`;
    });
});
