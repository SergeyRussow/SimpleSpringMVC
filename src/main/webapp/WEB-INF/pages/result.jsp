<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>My entity</title>
</head>
<body>
    <p>Param in body: ${paramInBody}</p>
    <p>Param in URL: ${paramInURL}></p>
    <form action="/">
        <button type="submit">Go back</button>
    </form>
</body>
</html>