<!-- /.content-wrapper -->
<footer class="main-footer">
    <div class="float-right hidden-xs">
        <b>Version</b> 2.4.0
    </div>
    <strong>Copyright &copy; <%
            Date dNow = new Date();
            SimpleDateFormat ft =
                    new SimpleDateFormat("yyyy");
            String currentDate = ft.format(dNow);
        %>
            <%=currentDate%>
</footer>
</body>
</html>
