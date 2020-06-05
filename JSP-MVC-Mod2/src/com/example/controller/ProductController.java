@javax.servlet.annotation.WebServlet(name = "ProductController")
public class ProductController extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, java.io.IOException {
        String name = request.getParameter("name");
        String description = request.getParameter("description");

        productBean = new ProductBean();
        productDataBean.setName(name);
        productBean.setDescription(description);

        try {
            boolean status = productBean.getInsertProduct();

            HttpSession session = request.getSession();

            if (status){
                session.setAttribute("product", productBean);
                response.sendRedirect("success.jsp");
            } else {
                response.sendRedirect("failed.jsp");
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {

    }
}
