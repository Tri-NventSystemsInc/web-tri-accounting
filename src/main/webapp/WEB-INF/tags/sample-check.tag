<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style>

    .check {
        font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
        font-size: 12px;
    }
    .date {
        position: absolute;
        margin-left: ${checkConfig.dateX}px;
        margin-top: ${checkConfig.dateY}px;
    }

    .payee {
        position: absolute;
        margin-left: ${checkConfig.payeeX}px;
        margin-top: ${checkConfig.payeeY}px;
        width: ${checkConfig.payeeW}px;
        border-bottom: 1px solid #003399;
    }

    .numericAmount {
        position: absolute;
        margin-left: ${checkConfig.numericAmountX}px;
        margin-top: ${checkConfig.numericAmountY}px;
}

    .alphaAmount {
        position: absolute;
        margin-left: ${checkConfig.alphaAmountX}px;
        margin-top: ${checkConfig.alphaAmountY}px;
        width: ${checkConfig.alphaAmountW}px;
        border-bottom: 1px solid #003399;
    }
    .sig1 {
        position: absolute;
        margin-left: ${checkConfig.sig1X}px;
        margin-top: ${checkConfig.sig1Y}px;
        border-top: 1px solid #003399;
    }

    .sig2 {
        position: absolute;
        margin-left: ${checkConfig.sig2X}px;
        margin-top: ${checkConfig.sig2Y}px;
        border-top: 1px solid #003399;
    }

    .checkNo {
        position: absolute;
        margin-left: ${checkConfig.checkNoX}px;
        margin-top: ${checkConfig.checkNoY}px;
    }

</style>


<div class="check">
    <span class="checkNo">${checkConfig.checkNoPrefix} xxxxxx</span>
    <span class="date">April 18, 1987</span>
    <span class="payee">Juan dela Cerna</span>
    <span class="numericAmount">1,653,534.54</span>
    <span class="alphaAmount">One million six hundred fifty three thousand five hundred thirty four and 54/100</span>
    <c:if test="${checkConfig.withSigner}">
        <span class="sig1">Signature 1</span>
        <span class="sig2">Signature 2</span>
    </c:if>

</div>